package user.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Component
public class UserDTO {
    private Long userId;
    private String userEmail;
    private String userPassword;
    private UserRole userRole;
    private String userPnum;

    @Override
    public String toString() {
        return userEmail + "\t" + userId + "\t" + userPassword +"\t" + userPnum;
    }

}
