package j06_조건;

public class While {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		int i = 0; // 초기화
		
		while(i < 5 ) { // 조건문
			System.out.println(i); //실행문
			i++; //후처리문
		}
		
		System.out.println("프로그램 종료");
	}
	
	/*
	 * while문의 기본구조
	 * while(조건문) {
	 * 				<수행할 문장a>;
	 * 				<수행할 문장b>;
	 * ...
	 * }
	 */

}
