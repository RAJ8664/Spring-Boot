package com.roy.raj.Spring.Security.Controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roy.raj.Spring.Security.Model.User;
import com.roy.raj.Spring.Security.Service.UserService;

@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return service.register(user);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUser() {
        List<User> users = service.getAllUser();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @GetMapping("/login")
    public String login() {
        log.info("RAJ ROY");
        //log.info("User is trying to login with username: ", user.getUserName() + " and password with: " + user.getUserPassword());        
       // return service.verify(user);
        return "User is trying to login";
    }
    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return "success";
    }
}
