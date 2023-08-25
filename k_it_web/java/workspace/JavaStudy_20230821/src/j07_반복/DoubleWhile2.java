package j07_반복;

import java.util.Scanner;

public class DoubleWhile2 {

	public static void main(String[] args) {
		
		/*
		 * 수업 시작 시간: 7
		 * 7시
		 * 			1분
		 * 			2분
		 * 			3분
		 * 			...
		 * 			50분
		 * 			쉬는시간
		 * 			1분
		 * 			2분
		 * 			...
		 * 			10분
		 * 8시
		 * 			1분
		 * 			...
		 * 
		 * 수업끝
		 */
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int j = 0;
		System.out.print("수업 시작 시간: ");
		num = scanner.nextInt();
		
		while(j < 3) {
			System.out.println(num + "시");
			num++;
			int i = 0;
			while(i < 50) {
				System.out.println("\t" + (i + 1) + "분");
				i++;
			}
			System.out.println("\t쉬는시간");
			i = 0;
			while(i < 10) {
				System.out.println("\t" + (i + 1) + "분");
				i++;
			}
			j++;
		}
		System.out.println("수업 끝");
		scanner.close();
	}

}
