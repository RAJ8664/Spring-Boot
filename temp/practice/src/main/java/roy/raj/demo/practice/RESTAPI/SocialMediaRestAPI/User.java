package roy.raj.demo.practice.RESTAPI.SocialMediaRestAPI;

import java.time.LocalDate;

import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;

public class User {
    @Size(min = 2 , message = "UserName should have Minimum of 2 Characters")
    private String UserName;
    private int UserId;
    @Past(message = "Birth Date should be a valid Date")
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
