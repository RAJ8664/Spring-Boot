package com.roy.raj.TODO.WEB.APP.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "login" , method = RequestMethod.GET)
    public String GoToLogin() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String GoToWelcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
        model.put("name" , name);
        model.put("password" , password);

        if(authenticationService.authenticate(name, password)) {
            return "welcome";
        }
        model.put("ErrorMessage" , "Invalid username or password");
        return "login";
    }

}
