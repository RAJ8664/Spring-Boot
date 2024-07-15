package com.roy.raj.TODO.WEB.APP.Login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

   private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/simple-login")
    public String login() {
        return "login";
    }

    //localhost:8080/login?name=RAJ
    @RequestMapping("/login-with-param")
    public String login(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        logger.debug("current_name is {}" , name);
        //mention ${name} in the login.jsp file
        return "login";
    }

}
