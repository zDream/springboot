package tv.seei.manage.common.aspect;

import jdk.nashorn.internal.parser.Token;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import tv.seei.manage.authorization.dao.UserDao;
import tv.seei.manage.authorization.entity.TokenModel;
import tv.seei.manage.authorization.entity.User;
import tv.seei.manage.authorization.service.TokenManage;
import tv.seei.manage.authorization.service.UserService;
import tv.seei.manage.common.annotation.AuthenticationRequired;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Aspect
public class AuthenticationAspect {

    @Autowired
    public UserDao userDao;

    @Autowired
    public TokenManage tokenManage;

    @Around(value = "@annotation(AuthenticationRequired) && @annotation(RequestMapping)",argNames = "RequestMapping,AuthenticationRequired")
    public String authenticate(ProceedingJoinPoint joinPoint, RequestMapping mapping, AuthenticationRequired ctx) throws Throwable {

        HttpServletRequest request = null;
        HttpServletResponse response = null;
        ModelMap modelMap = null;
        String finalResult = "";
        String token = "";
        String username = "";
        String password = "";

        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            if(arg instanceof HttpServletRequest){
                request = (HttpServletRequest) arg;
            }else if (arg instanceof ModelMap){
                modelMap = (ModelMap) arg;
            }else if(arg instanceof HttpServletResponse){
                response = (HttpServletResponse) arg;
            }else {
                continue;
            }
        }
        token = request.getParameter("token");
        if(StringUtils.isEmpty(token)){
            username = request.getParameter("username");
            password = request.getParameter("password");
            if(!StringUtils.isEmpty(username) && !StringUtils.isEmpty(password)){

                User user = userDao.findUserByUsernameAndPassword(username, password);
                if(user !=null){
                    System.out.println("登录成功，生成token");
                    TokenModel new_token = tokenManage.createToken(user.getId());
                    modelMap.addAttribute("token",new_token.getToken());
                }else {
                    response.sendRedirect("/index?msg=用户名或者密码输入错误");
                    return "";
                }
            }else {
                response.sendRedirect("/index");
                return "";
            }
        }
        finalResult = joinPoint.proceed().toString();
        return finalResult;
    }
}
