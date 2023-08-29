package j08_메소드;

import java.util.Scanner;

public class Method4 {
	
	public static void delete() {
		System.out.println("삭제되었습니다.");
	}
	
	public static void savePw(String str) {
		for(int i = 0; i < str.length(); i++) {
			String spaceConfirm = str.substring(i, i + 1);
			if(spaceConfirm.equals(" ")) {
				System.out.println("공백을 포함할 수 없습니다.");
			}else {
				System.out.println("저장되었습니다.");
				continue;
			}
		}
	}
	
	public static void check(String password) {
		for(int i = 0; i < password.length(); i++) {
			String subpass = password.substring(i, i + 1);
			
			if(subpass.equals("/") 
				|| subpass.equals(",") 
				|| subpass.equals(" ")) {
				System.out.println("비밀번호에는 /, 콤마(,), 공백( ) 이 포함될 수 없습니다.");
			}
			else {
				System.out.println("사용가능한 비밀번호입니다.");
				continue;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String password = null;
			System.out.print("동작을 입력하시오 : ");
			String type = scanner.next();
			if(type.equals("저장")) {
				System.out.println("비밀번호를 입력하시오 : ");
				password = scanner.next();
				savePw(password);
			} else if(type.equals("삭제")) {
				System.out.println("비밀번호를 입력하시오 : ");
				delete();
			} else if(type.equals("확인")) {
				System.out.println("비밀번호를 입력하시오 : ");
				password = scanner.next();
				check(password);
			} else {
				break;
			}
			
		}
		scanner.close();
	}

}
