package user.service;

import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.bean.UserDTO;
import user.bean.UserRole;
import user.dao.UserDAO;
import user.dao.UserDAOImpl;

import java.util.Scanner;

@Service
public class UserInsertService implements UserService {

    @Setter
    private UserDTO userDTO; // 정보를 받아온 것 처리
    @Setter

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);

        // 사용자 정보 입력 받기
        System.out.print("사용자 ID 입력 : ");
        Long userId = scan.nextLong();
        scan.nextLine(); // 버퍼 비우기
        System.out.print("이메일 입력 : ");
        String userEmail = scan.nextLine();
        System.out.print("비밀번호 입력 : ");
        String userPassword = scan.nextLine();
        UserRole userRole = UserRole.ROLE_USER;
        System.out.print("전화번호 입력 : ");
        String userPnum = scan.nextLine();

        // UserDTO 객체에 정보 설정
        userDTO.setUserId(userId);
        userDTO.setUserEmail(userEmail);
        userDTO.setUserPassword(userPassword);
        userDTO.setUserRole(userRole);
        userDTO.setUserPnum(userPnum);

        // UserDAO를 통해 데이터베이스에 저장
        userDAO.insertUser(userDTO);

        System.out.println("사용자 정보가 성공적으로 등록되었습니다.");
    }
}
