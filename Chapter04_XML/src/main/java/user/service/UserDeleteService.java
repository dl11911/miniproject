package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

public class UserDeleteService implements UserService {
	@Setter
	private UserDAO userDAO;
	
	@Override
	public void execute() {
		System.out.println();
		Scanner scan =new Scanner(System.in);
		
		System.out.print("수정할 아이디 입력 : ");
		String id = scan.next();
		UserDTO userDTO = userDAO.idCheck(id);
		
		if(userDTO==null) {
			System.out.println("찾고자 하는 아이디가 없습니다.");
			return;
		}
		
		userDAO.delete(id);
		
		System.out.println(id + "님의 데이터를 삭제하였습니다.");

	}

}


