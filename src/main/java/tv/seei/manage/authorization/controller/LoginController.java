package tv.seei.manage.authorization.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import tv.seei.manage.authorization.entity.User;
import tv.seei.manage.authorization.service.UserService;
import tv.seei.manage.common.annotation.AuthenticationRequired;
import tv.seei.manage.common.utils.ManageUtils;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/index")
@Api("loginController 相关api")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping
    public String index(HttpServletRequest request, HttpServletResponse response){
        System.out.println("this is index");
        return "index";
    }

    @ApiOperation("用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name="username",value = "用户名",required = true,dataType = "string"),
            @ApiImplicitParam(name="password",value = "密码",required = true,dataType = "string")
    })
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    @AuthenticationRequired(needLogin = true)
    public String login(ModelMap modelMap,HttpServletResponse response, HttpServletRequest request) throws JsonProcessingException {
        System.out.println("login dd");
        logger.info("这是logger ");
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> res = ManageUtils.initAjaxResponseMap();
        User lisi = new User(3L,"admin", "admin");
        userService.save(lisi);
        res.put("token",modelMap.get("token"));
        ManageUtils.setAjaxResponseSuccess(res);
        return mapper.writeValueAsString(res);
    }

}
