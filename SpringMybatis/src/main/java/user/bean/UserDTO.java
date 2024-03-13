package user.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Component
public class UserDTO {
//    이렇게 하면 여기에 아까처럼 써도 됨  확인?이제 지울테니 혼자해봐요오 굿 >>
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
