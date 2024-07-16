package com.roy.raj.TODO.WEB.APP.HelloController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class sayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello() {
        return "hello, what are you learning today ?";
    }

    //to display some html content to pages , use jsp (add the dependency first(tomcat embed jasper));
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}
