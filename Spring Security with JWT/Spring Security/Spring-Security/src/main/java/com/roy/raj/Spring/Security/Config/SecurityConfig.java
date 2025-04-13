package com.roy.raj.Spring.Security.Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  /*If in case spring wants to search for the configuration file, it will search here as well*/
@EnableWebSecurity /*I don't want the default security provided by spring, i want to implement my own security here*/
public class SecurityConfig {

    @Autowired
    private UserDetailsService myUserDetailsService;
    
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        /* disable csrf (now you cannot have get request with localhost:8080/csrf-token --> since we are disabling it here.) */
        http.csrf(customizer -> customizer.disable());

        /* now i want to have my own authentication to my application */
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());

        /* enable form login */
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults()); /* For the purpose of testing it on api tesing softwares (postman) */

        /* finally its going to build the filter chain */
        return http.build();
    }

    /*We want to have our own username and password, not the one provided in applications.properties*/
    /*we don't want to have hard coded username and password*/
    
    /*
     @Bean
    public UserDetailsService userDetailsService() {
        UserDetails user1 = User
                                .withDefaultPasswordEncoder()  /* Don't use it in production only for demo purpose* /
                                .username("root")
                                .password("root")
                                .roles("USER")
                                .build();
        UserDetails user2 = User
                                .withDefaultPasswordEncoder()
                                .username("root1")
                                .password("root1")
                                .roles("ADMIN")
                                .build();
        return new InMemoryUserDetailsManager(user1, user2);
    }
    */

    /* I want to have my own way of checking the usercredentials whether it is correct or not, and will also store the user credentials in the database (mysql) */
    /* For now I have insert two users in the database manually for testing purpose */
    @Bean
    public AuthenticationProvider authenticationProvider() {
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        /* For now I am not using any password encoder, Just storing the password as text */
        provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
        
        /* I also want to have my own userdetails service */
        provider.setUserDetailsService(myUserDetailsService);
        
        return provider;
    }

}
