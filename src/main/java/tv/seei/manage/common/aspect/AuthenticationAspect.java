package tv.seei.manage.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import tv.seei.manage.common.annotation.AuthenticationRequired;

import javax.servlet.http.HttpServletRequest;

@Component
@Aspect
public class AuthenticationAspect {

    @Around(value = "@annotation(AuthenticationRequired) && @annotation(RequestMapping)",argNames = "RequestMapping,AuthenticationRequired")
    public String authenticate(ProceedingJoinPoint joinPoint, RequestMapping mapping, AuthenticationRequired ctx) throws Throwable {

        HttpServletRequest request = null;
        ModelMap modelMap = null;
        String finalResult = joinPoint.proceed().toString();
        String token = "";

        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            if(arg instanceof HttpServletRequest){
                request = (HttpServletRequest) arg;
                continue;
            }
            if(arg instanceof ModelMap){
                modelMap = (ModelMap) arg;
            }
        }
        token = request.getParameter("token");
        if(token == ""){
            return "redirect: index";
        }

        return finalResult;
    }
}
