package j10_배열;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * 실습
		 * 1 ~ 1000 까지를 배열에 넣고
		 * 
		 * 출력
		 * 1
		 * 2
		 * 3
		 * ...
		 * 1000
		 * 
		 */
		
		int[] numbers = new int[1000];		
		for(int i = 0; i < numbers.length; i ++) {
			numbers[i] = i + 1;
			System.out.println(numbers[i]);
		}
		
	}

}
