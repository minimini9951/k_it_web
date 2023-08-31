package j10_배열;

//import j09_클래스.Car;

public class Array1 {

	public static void main(String[] args) {
		
		int[] numbers = new int[5];
				
		numbers[1] = 5;
		numbers[2] = 6;
		numbers[3] = 7;
		numbers[4] = 8;
		//numbers[5] = 9;
		
		System.out.println(numbers[2]);
		
		// 문자열 배열
		String[] strArray = new String[3];
		strArray[0] = "홍길동";
		System.out.println(strArray[0]);
		
		//객체 배열
		//Car[] car = new Car[3];
	}

}
