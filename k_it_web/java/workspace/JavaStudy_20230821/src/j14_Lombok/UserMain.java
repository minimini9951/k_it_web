package j14_Lombok;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		
		/*
		 * 실습
		 * userId
		 * userPw
		 * userName
		 * userAge
		 * userEmail
		 * 
		 * 아이디를 입력하시오
		 * gildong
		 * 비밀번호를 입력하시오
		 * 1234
		 * 이름을 입력하시오
		 * 홍길동
		 * 나이를 입력하시오
		 * 18
		 * 이메일을 입력하시오
		 * useremail
		 * 
		 * 홍길동(gildong)님 회원가입을 축하합니다.
		 * 
		 * 내정보 확인
		 * 입력값 다 나오게 하기
		 */
		String userId = null;
		String userPw = null;
		String userName = null;
		int userAge = 0;
		String userEmail = null;
		
		Scanner scanner = new Scanner(System.in);
		Ubuilder ubuilder = new Ubuilder();
		
		System.out.println("아이디를 입력하시오");
		userId = scanner.next();
		System.out.println("비밀번호를 입력하시오");
		userPw = scanner.next();
		System.out.println("이름을 입력하시오");
		userName = scanner.next();
		System.out.println("나이를 입력하시오");
		userAge = scanner.nextInt();
		System.out.println("이메일을 입력하시오");
		userEmail = scanner.next();
		
		User user = User.builder()
				.userId(userId)
				.userPw(userPw)
				.userName(userName)
				.userAge(userAge)
				.userEmail(userEmail)
				.build();
		
		System.out.println(user.getUserName() + "(" + user.getUserId() + ")님 회원가입을 축하합니다.");
		System.out.println("내 정보 확인");
		System.out.println("아이디 : " + user.getUserId());
		System.out.println("비밀번호 : " + user.getUserPw());
		System.out.println("이름 : " + user.getUserName());
		System.out.println("나이 : " + user.getUserAge());
		System.out.println("이메일 : " + user.getUserEmail());
		
		scanner.close();
	}
}