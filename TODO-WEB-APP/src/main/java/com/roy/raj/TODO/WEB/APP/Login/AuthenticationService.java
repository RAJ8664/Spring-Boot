package com.roy.raj.TODO.WEB.APP.Login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        if(username.equals("admin") && password.equals("admin")) {
            return true;
        }
        return false;
    }
}
