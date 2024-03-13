package user.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.bean.UserDTO;
import user.dao.UserDAO;
import user.dao.UserDAOImpl;

import java.util.List;

@Service
public class UserSelectService implements UserService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public void execute() {
        System.out.println("데이터 조회 처리");

        List<UserDTO> list = userDAO.getUserList();

        System.out.println("이메일\tID\t비밀번호\t전화번호");
        for(UserDTO userDTO : list) {
            if(userDTO != null) { // null 체크 추가
                System.out.println(userDTO.getUserEmail()); // toString()은 생략 가능합니다.
            } else {
                System.out.println("빈 데이터");
            }
        }
    }
}
