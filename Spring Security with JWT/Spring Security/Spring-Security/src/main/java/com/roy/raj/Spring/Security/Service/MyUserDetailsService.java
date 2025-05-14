package com.roy.raj.Spring.Security.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.roy.raj.Spring.Security.Model.User;
import com.roy.raj.Spring.Security.Model.UserPrincipal;
import com.roy.raj.Spring.Security.Repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User current_user = repository.findByUserName(username);
        if (current_user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new UserPrincipal(current_user);
    }
}
