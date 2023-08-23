package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * 이름: 홍길동						next		name
		 * 층수(단독주택은 1로 표기): 14 	nextInt		floor
		 * 거주지: 부산 진구 부전동 		nextLine	address
		 * 연락처: 010-1234-5678 			nextLine	phone
		 * 
		 * 출력:
		 * 이름은 홍길동 이고 거주지는 부산 진구 부전동 입니다.
		 * 층수는 14층입니다.
		 * 연락처는 010-1234-5678입니다.
		 */
		
		String name = null;
		int floor = 0;
		String address = null;
		String phone = null;
		
		System.out.print("이름: ");
		name = scanner.next();
		
		System.out.print("층수: ");
		floor = scanner.nextInt();
		
		System.out.print("거주지: ");
		address = scanner.nextLine();
		
		System.out.print("연락처: ");
		phone = scanner.nextLine();
		
		System.out.println("이름은" + name + "이고 거주지는 " + address + "입니다.");
		System.out.println("층수는 " + floor + "입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
		
		scanner.close();
	}

}
