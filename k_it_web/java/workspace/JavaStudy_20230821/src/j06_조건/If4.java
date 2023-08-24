package j06_조건;

import java.util.Scanner;

public class If4 {

	public static void main(String[] args) {
		
		/*
		 * 승강장 3개
		 * platform1, 2, 3
		 * 
		 * 3개의 승강장 층수를 입력받고
		 * 제일 낮은 위치의 승강장 탑승
		 */
		
		Scanner scanner = new Scanner(System.in);
		int platform1 = 0;
		int platform2 = 0;
		int platform3 = 0;
		
		System.out.print("첫번째 승강장 층: ");
		platform1 = scanner.nextInt();
		System.out.print("두번째 승강장 층: ");
		platform2 = scanner.nextInt();
		System.out.print("세번째 승강장 층: ");
		platform3 = scanner.nextInt();
		
		if((platform1 == platform2) && (platform1 == platform3)) {
			System.out.println("아무 승강장을 이용하세요.");
		} else if((platform1 >= platform2) && (platform1 >= platform3)) {
			System.out.println("1승강장을 이용하세요.");
		} else if((platform2 >= platform1) && (platform2 >= platform3)) {
			System.out.println("2승강장을 이용하세요.");
		} else if((platform3 >= platform1) && (platform3 >= platform2)) {
			System.out.println("3승강장을 이용하세요.");
		}
		
		scanner.close();
	}

}
