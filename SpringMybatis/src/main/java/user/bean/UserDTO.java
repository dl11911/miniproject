package user.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Component
public class UserDTO {
    private Long user_id;
    private String user_email;
    private String user_password;
    private UserRole user_role;
    private String user_pnum;

    @Override
    public String toString() {
        return user_email + "\t" + user_id + "\t" + user_password +"\t" + user_pnum;
    }

}
