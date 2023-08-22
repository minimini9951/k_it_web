package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		String name; // 변수선언
		name = "홍길동"; // 변수 값 할당
		System.out.println(name); // 출력
		
		/*
		 * 변수 재선언 불가능
		 * String name; 불가능
		 */
		
		// 여기까지 name엔 홍길동이 할당되어 있음
		name = "최연호";
		System.out.println(name);
		
		// 동시에 변수 선언 및 초기화
		int age = 18;
		/* 자동완성 = Ctrl + Space
		 * 즉시실행 = Ctrl + F11
		 * syso, sysout
		 */ 
		System.out.println(age);
		
	}

}
