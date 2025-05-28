package com.roy.raj.Spring.Security.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.roy.raj.Spring.Security.Model.User;
import com.roy.raj.Spring.Security.Repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private AuthenticationManager authManager;

    /* Strength here mean for how many round the algo with hash the password (algo(plaintext) --> hash1 --> algo(hash1) --> hash2    --> algo(hash2) --> hash3 ......)*/
    private final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);

    public User register(User user) {
        /* before saving the user, we want to encrypt the password */
        String plainTextPassword = user.getUserPassword();

        /* Now just encrypt the password and set it to Orignal UserPassword and finally save it to database */
        String encryptedPassword = encoder.encode(plainTextPassword);
        user.setUserPassword(encryptedPassword);
        return repository.save(user);
    }

    /* user service to get all the users along with the details*/
    public List<User> getAllUser() {
        return repository.findAll();
    }

    /* user service to verify the user */
    public String verify(User user) {
        Authentication auth = authManager.authenticate(
            new UsernamePasswordAuthenticationToken(user.getUserName(), user.getUserPassword()));
        if (auth.isAuthenticated()) {
            return "User is authenticated";
        } else {
            return "User is not authenticated";
        }
    }  
    
}
