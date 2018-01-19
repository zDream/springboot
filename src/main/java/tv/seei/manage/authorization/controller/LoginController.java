package tv.seei.manage.authorization.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    private UserService userService;

    @RequestMapping
    public String index(HttpServletRequest request, HttpServletResponse response){
        System.out.println("this is index");
        return "index";
    }


    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @AuthenticationRequired(needLogin = true)
    public String login(ModelMap modelMap,HttpServletResponse response, HttpServletRequest request) throws JsonProcessingException {
        System.out.println("login dd");
        logger.info("这是logger ");
        ObjectMapper mapper = new ObjectMapper();
        Map<String,Object> res = ManageUtils.initAjaxResponseMap();
        User lisi = new User(1L,"lisi", "34");
        userService.save(lisi);
        res.put("data",lisi);
        ManageUtils.setInitAjaxResponseMap(res);
        return mapper.writeValueAsString(res);
    }
}
