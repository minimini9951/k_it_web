package j08_메소드;

import java.util.Scanner;

public class Method5 {
	
	public static void savePw(String str) {
		boolean flag = false;
		for(int i = 0; i < str.length(); i++) {
			String spaceConfirm = str.substring(i, i + 1);
			if(spaceConfirm.equals(" ")) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("공백을 포함할 수 없습니다.");
		}else {
			System.out.println("저장되었습니다.");
		}
	}
	
	public static void deletePw(String str) {
		System.out.println("삭제되었습니다.");
	}
	
	public static void confirmPw(String str) {
		boolean flag = false;
		for(int i = 0; i < str.length(); i++) {
			String confirmPassword = str.substring(i, i + 1);
			if(confirmPassword.equals("/")
					|| confirmPassword.equals(",")
					|| confirmPassword.equals(" ")) {
				flag = true;
			}
		}
		if(flag) {
			System.out.println("비밀번호에는 / , 공백이 포함될 수 없습니다.");
		}else {
			System.out.println("사용가능한 비밀번호입니다.");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean flag1 = true;
		while(flag1) {
			String action = null;
			String password = null;
			
			System.out.print("동작을 입력하시오");
			action = scanner.nextLine();
			System.out.print("비밀번호를 입력하시오 :");
			password = scanner.nextLine();
			
			if(action.equals("저장")) {
				savePw(password);
				continue;
			}else if(action.equals("삭제")) {
				deletePw(password);
				continue;
			}else if(action.equals("확인")) {
				confirmPw(password);
				continue;
			}else if(action.equals("exit")) {
				flag1 = false;
			}
			break;
			
			// savePw
			// deletePw
			// confirmPw
		}
		scanner.close();
	}

}
