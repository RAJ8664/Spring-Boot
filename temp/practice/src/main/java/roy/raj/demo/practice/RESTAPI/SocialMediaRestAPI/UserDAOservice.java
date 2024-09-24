package roy.raj.demo.practice.RESTAPI.SocialMediaRestAPI;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//DAO -- > data access object;
@Component
public class UserDAOservice {
    
    private static ArrayList<User> users = new ArrayList<>();
    private static int Current_User = 1;
    static {
        users.add(new User("RAJ ROY" , Current_User++, LocalDate.now().minusYears(30)));
        users.add(new User("UNKOWN" , Current_User++, LocalDate.now().minusYears(25)));
    }

    public ArrayList<User> FindAllUser() {
        return users;
    }

    public void SaveUser(User newUser) {
        newUser.setUserId(Current_User++);
        users.add(newUser);
    }

    public User FindUserById(int UserId) {
        try {
            for (User temp : users) {
                if (temp.getUserId() == UserId) return temp;
            }
            throw new NoSuchFieldError("No such User Exits");
        }
        catch (Exception e) {
            throw new NoSuchFieldError("No Such User Found !");
        }
    }

    public int DeleteById(int UserId) {
        int n = users.size();
        for (int i = 0; i < n; i++) {
            if (users.get(i).getUserId() == UserId) {
                users.remove(i);
                return 1;
            }
        }
        return 0;
    }

}
