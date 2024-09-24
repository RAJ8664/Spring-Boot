package roy.raj.demo.practice.RESTAPI.SocialMediaRestAPI;

import java.time.LocalDate;

public class User {
    private String UserName;
    private int UserId;
    private LocalDate UserBirthDate;

    public User() {}
    public User(String UserName, int UserId, LocalDate UserBirthDate) {
        this.UserName = UserName;
        this.UserId = UserId;
        this.UserBirthDate = UserBirthDate;
    }

    public String getUserName() {
        return this.UserName;
    }
    public int getUserId() {
        return this.UserId;
    }
    public LocalDate getUserBirthDate() {
        return this.UserBirthDate;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    public void setUserId(int UserId) {
        this.UserId = UserId;
    }
    public void setUserBirthDate(LocalDate UserBirthDate) {
        this.UserBirthDate = UserBirthDate;
    }

    @Override
    public String toString() {
        return "{" +
            " UserName='" + getUserName() + "'" +
            ", UserId='" + getUserId() + "'" +
            ", UserBirthDate='" + getUserBirthDate().toString() + "'" +
            "}";
    }
    
}
