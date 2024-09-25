package roy.raj.demo.practice.RESTAPI.SocialMediaRestAPI;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;

//DAO -- > data access object;
//we just implement business logic here;

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

    public int DeleteUserById(int UserId) {
        int n = users.size();
        for (int i = 0; i < n; i++) {
            if (users.get(i).getUserId() == UserId) {
                users.remove(i);
                return 1;
            }
        }
        return 0;
    }

    public String UpdateNameById(int UserId, String UserName) {
        try {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUserId() == UserId) {
                    User current_User = users.get(i);
                    users.remove(i);
                    current_User.setUserName(UserName);
                    users.add(current_User);
                    return "Details Updated SuccessFully";
                }
            }
            throw new NoSuchFieldError("No Such User Found !");
        } catch (Exception e) {
            throw new NoSuchFieldError("No Such User Found !");
        }
    }


    public String UpdateBirthDateById(int UserId, LocalDate UserBirthDate) {
        try {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getUserId() == UserId) {
                    User current_User = users.get(i);
                    users.remove(i);
                    current_User.setUserBirthDate(UserBirthDate);
                    users.add(current_User);
                    return "Details Updated SuccessFully";
                }
            }
            throw new NoSuchFieldError("No Such User Found !");
        } catch (Exception e) {
            throw new NoSuchFieldError("No Such User Found !");
        }
    }

}
