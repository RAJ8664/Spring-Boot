package com.roy.raj.Spring.Security.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HelloWorldController {
 
    @RequestMapping(method = RequestMethod.GET, path = "/hello")
    public ResponseEntity<String> helloWorld(HttpServletRequest request) {
        String greet = "Hello Programmer your session Id is : " + request.getSession().getId();;
        return new ResponseEntity<>(greet, HttpStatus.OK);
    }

}
