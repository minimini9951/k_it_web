package j07_반복;

import java.util.Scanner;

public class Paging {

	public static void main(String[] args) {
		
		/*
		 * 총 게시물 수 : 85
		 * 한 페이지에 들어갈 게시글 수 : 10
		 * 
		 * 총 페이지 수 : 9
		 * 1페이지
		 *  85
		 *  84
		 *  83
		 *  ...
		 *  76
		 * 2페이지
		 *  75
		 *  74
		 *  ...
		 *  66
		 * ...
		 * 9페이지
		 * 	5
		 *  4
		 *  3
		 *  2
		 *  1
		 */
		
		int totalNum = 0;
		int onePage = 0;
		int totalPage = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("총 게시물 수 : ");
		totalNum = scanner.nextInt();
		
		System.out.print("한 페이지에 들어갈 게시글 수 : ");
		onePage = scanner.nextInt();
		
		// 내 작성 코드
		if(totalNum % 10 != 0) {
			totalPage = totalNum / onePage + 1;
		}
		else totalPage = totalNum / onePage;
		//
		
		// 멘토 작성 코드
		totalPage = totalNum % onePage == 0 ? totalNum / onePage
											: totalNum / onePage +1;
		//
		System.out.println("총 페이지 수 : " + totalPage);
		
		for(int i = 0; i < totalPage; i ++) {
			System.out.println((i + 1) + "페이지");
			
			if(totalNum < 10) {
				for(int j = 0; j < totalNum;) {
					System.out.println(" " + totalNum);
					totalNum -= 1;
				}
			}
			else for(int j = 0; j < onePage; j++) {
					System.out.println(" " + totalNum);
					totalNum -= 1;
			}
		}
		scanner.close();
	}

}
