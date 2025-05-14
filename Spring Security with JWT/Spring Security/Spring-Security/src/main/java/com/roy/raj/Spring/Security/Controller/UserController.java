package com.roy.raj.Spring.Security.Controller;

import java.util.List;

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
}
