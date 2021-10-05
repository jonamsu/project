package quiz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {

		QuizDao dao = QuizDaoIpl.getInstance();

		Scanner scan = new Scanner(System.in);

		System.out.println("사용할 아이디를 입력해주세요.");
		String id = scan.next();

		System.out.println("사용할 비밀번호를 입력하세요");
		String pw = scan.next();

		System.out.println("이름을 입력하세요");
		String name = scan.next();

		System.out.println("전화번호를 입력해주세요");
		String phoneNum = scan.next();

		System.out.println("이메일을 입력해주세요");
		String email = scan.next();

		try {
			dao.signUp(0, id, pw, name, phoneNum, email);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
