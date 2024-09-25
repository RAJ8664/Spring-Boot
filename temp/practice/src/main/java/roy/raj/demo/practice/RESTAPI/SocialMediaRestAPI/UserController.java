package roy.raj.demo.practice.RESTAPI.SocialMediaRestAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

import java.util.ArrayList;

@RestController
public class UserController {
    
    @Autowired
    private UserDAOservice User_Service;

    @RequestMapping(method = RequestMethod.GET , path = "/users")
    public ArrayList<User> getUsers() {
        return User_Service.FindAllUser();
    }


    @RequestMapping(method = RequestMethod.GET , path = "/users/{UserId}")
    public User FindUser(@PathVariable int UserId) {
        return User_Service.FindUserById(UserId);
    } 

    @RequestMapping(method = RequestMethod.DELETE, path = "/users/{UserId}")
    public String DeleteUser(@PathVariable int UserId) {
        if (User_Service.DeleteUserById(UserId) == UserId) {
            return "User Deleted SuccessFully";
        }
        return "No User Found";
    }


    //create a user and save it -- >> need to use post method;
    @RequestMapping(method = RequestMethod.POST , path = "/users")
    public String saveUser(@Valid @RequestBody User user) {
        User_Service.SaveUser(user);
        return "User Created SuccessFully";
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/users/{id}/{name}")
    public String updateNameDetails(@PathVariable int id, @PathVariable String name) {
        User_Service.UpdateNameById(id, name);
        return "Details updated SuccessFully !";
    }
}
