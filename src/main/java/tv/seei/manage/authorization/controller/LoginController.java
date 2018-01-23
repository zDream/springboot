package tv.seei.manage.authorization.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.codehaus.groovy.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;
import tv.seei.manage.authorization.entity.User;
import tv.seei.manage.authorization.service.UserService;
import tv.seei.manage.common.annotation.AuthenticationRequired;
import tv.seei.manage.common.utils.ManageUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/index")
@Api(description = "LongController")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public Map<String,Object> index(HttpServletRequest request, HttpServletResponse response){
        Map<String,Object> map = ManageUtils.initAjaxResponseMap();
        map.put("msg",request.getParameter("msg"));
        return map;
    }

    @ApiOperation("用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value = "用户名",required = true,dataType = "string",paramType = "query"),
            @ApiImplicitParam(name="password",value = "密码",required = true,dataType = "string",paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code=0,message = "成功")
    })
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @AuthenticationRequired(needLogin = true)
    public String login(HttpServletResponse response, HttpServletRequest request,@ApiParam(hidden = true) ModelMap modelMap) throws JsonProcessingException {
        logger.info("这是logger ");
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> res = ManageUtils.initAjaxResponseMap();
        res.put("token",modelMap.get("token"));
        ManageUtils.setAjaxResponseSuccess(res);
        return mapper.writeValueAsString(res);
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value = "用户名",required = true,dataType = "string",paramType = "query"),
            @ApiImplicitParam(name="password",value = "密码",required = true,dataType = "string",paramType = "query")
    })
    @ApiResponses({
            @ApiResponse(code=0,message = "成功")
    })
    @ApiOperation("用户注册")
    @ApiParam(hidden = true)
    @RequestMapping(value = "/regedit",method = RequestMethod.POST)
    public Map<String,Object> regedit(HttpServletResponse response,HttpServletRequest request){
        Map<String,Object> res = ManageUtils.initAjaxResponseMap();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)){
            res.put("msg","用户名或者密码不能为空");
            return res;
        }
        User userbyUserName = userService.getUserbyUserName(username);
        if(userbyUserName != null){
            res.put("msg","用户名已存在，请重新输入");
            return res;
        }
        User user = new User(username,password);
        userService.save(user);
        ManageUtils.setAjaxResponseSuccess(res);
        return res;
    }
}
