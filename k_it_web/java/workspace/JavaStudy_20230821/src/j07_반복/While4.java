package j07_반복;

import java.util.Scanner;

public class While4 {

	public static void main(String[] args) {
		
		/*
		 * 구구단
		 * 실행할 단 수를 입력하시오: 7
		 * 7 X 1 = 7
		 * 7 X 2 = 14
		 * 7 X 3 = 21
		 * ...
		 * 7 X 9 = 63
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		int num = 0;
		
		System.out.print("실행할 단 수를 입력하시오: ");
		num = scanner.nextInt();
		while(i < 9) {
			System.out.println(num + " X " + (i + 1) + " = " + num * (i + 1));
			i++;
		}
		scanner.close();
		
	}

}
