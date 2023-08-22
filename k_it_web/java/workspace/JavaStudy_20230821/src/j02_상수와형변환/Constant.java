package j02_상수와형변환;

public class Constant {

	public static void main(String[] args) {
		
		// final 상수처리, 상수는 전체 대문자 및 스네이크 표기법
		// 상수 : 변하지 않는 수
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 0;
		
		int number = 80;
		
		System.out.println("최댓값: " + MAX_NUMBER);
		System.out.println("최솟값: " + MIN_NUMBER);
		System.out.println("현재값: " + number);
	}

}
