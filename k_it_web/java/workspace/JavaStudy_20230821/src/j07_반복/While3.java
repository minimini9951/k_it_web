package j07_반복;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		
		/*
		 * 엘리베이터
		 * 
		 * 확인한 층 수: 12
		 * 12
		 * 13
		 * 14
		 * 도착했습니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int floor1 = 0;
		int floor2 = 0;
		
		System.out.print("현재 층수 입력: ");
		floor1 = scanner.nextInt();
		
		System.out.print("갈 층수 입력: ");
		floor2 = scanner.nextInt();
		
		System.out.println("확인한 층 수: " + floor2);
		
		if(floor1 < floor2) {
			while(floor1 < floor2) {
				System.out.println(floor1 + 1);
				floor1++;
			}
			System.out.println("도착했습니다.");
		} else if(floor1 > floor2) {
			while(floor1 > floor2) {
				System.out.println(floor1 - 1);
				floor1--;
			}
			System.out.println("도착했습니다.");
		} else
			System.out.println("현재층입니다.");
		
		scanner.close();
	}

}
