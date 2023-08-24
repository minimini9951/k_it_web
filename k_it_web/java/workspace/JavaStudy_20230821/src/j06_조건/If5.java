package j06_조건;

import java.util.Scanner;

public class If5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int platform1 = 0;
		int platform2 = 0;
		int platform3 = 0;
		
		boolean bPlatform1 = true;
		boolean bPlatform2 = true;
		boolean bPlatform3 = true;
		
		int tPlatform1 = 0;
		int tPlatform2 = 0;
		int tPlatform3 = 0;
		
		System.out.print("1승강장의 상태를 입력하시오. (↑: true, ↓:false): ");
		bPlatform1 = scanner.nextBoolean();
		System.out.print("1승강장의 층수를 입력하시오: ");
		platform1 = scanner.nextInt();
		
		System.out.print("2승강장의 상태를 입력하시오. (↑: true, ↓:false): ");
		bPlatform2 = scanner.nextBoolean();
		System.out.print("2승강장의 층수를 입력하시오: ");
		platform2 = scanner.nextInt();
		
		System.out.print("2승강장의 상태를 입력하시오. (↑: true, ↓:false): ");
		bPlatform3 = scanner.nextBoolean();
		System.out.print("2승강장의 층수를 입력하시오: ");
		platform3 = scanner.nextInt();
		
		if(bPlatform1) {
			tPlatform1 = 5 * platform1;
		} else {
			tPlatform1 = 5 * platform1;
		}
		if(bPlatform2) {
			tPlatform2 = 5 * platform2;
		} else {
			tPlatform2 = 5 * platform2;
		}
		if(bPlatform3) {
			tPlatform3 = 5 * platform3;
		} else {
			tPlatform3 = 5 * platform3;
		}
		
		if(tPlatform1 < tPlatform2 && tPlatform1 < tPlatform3) {
			System.out.println("1승강장을 이용하시오");
		} else if(tPlatform2 < tPlatform1 && tPlatform2 < tPlatform3) {
			System.out.println("2승강장을 이용하시오");
		} else if(tPlatform3 < tPlatform1 && tPlatform3 < tPlatform2) {
			System.out.println("3승강장을 이용하시오");
		}
		scanner.close();
	}
}
