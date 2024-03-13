package user.service;

import lombok.Setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import user.bean.UserDTO;
import user.bean.UserRole;
import user.dao.UserDAO;
import user.dao.UserDAOImpl;

import java.util.Scanner;

@Setter
@Service
public class UserInsertService implements UserService {

    @Autowired
    private UserDTO userDTO; // 정보를 받아온 것 처리

    @Autowired
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
//        승훈이 열심히 집어넣는중
        userDTO.setUserId(userId);
//        승훈: 이름 넣었습니다!
        userDTO.setUserEmail(userEmail);
//       승훈: 이메일 등록 완료요~!
        userDTO.setUserPassword(userPassword);
//        승훈: 비밀번호 개꿀~ 해킹해야지ㅣ
        userDTO.setUserRole(userRole);
        userDTO.setUserPnum(userPnum);

        // UserDAO를 통해 데이터베이스에 저장
        userDAO.insertUser(userDTO);

        System.out.println("사용자 정보가 성공적으로 등록되었습니다.");
    }
}
