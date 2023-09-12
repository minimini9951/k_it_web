package j17_컬렉션.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		/*
		 * 사전검색 기능
		 * 검색어: 축구
		 * 축구 -> soccer
		 * 
		 * 검색어: 야구
		 * 야구 -> baseball
		 * 
		 * 검색어: 농구
		 * 농구 -> basketball
		 * 
		 * 검색어: 골프
		 * 골프 -> golf
		 * 
		 * 검색어: 수영
		 * 지원하지 않는 단어입니다.
		 * 
		 * 검색어: exit
		 * 프로그램 종료
		 */
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("축구", "soccer");
		dictionary.put("야구", "baseball");
		dictionary.put("농구", "basketball");
		dictionary.put("골프", "golf");
		
		Scanner scanner = new Scanner(System.in);
		Iterator<String> irKey = dictionary.keySet().iterator();
		
		String search = null;
		boolean flag = true;
		
		while(flag) {
			System.out.println("사전 검색 기능");
			System.out.println("프로그램 종료명령(exit)");
			
			System.out.print("검색어: ");
			search = scanner.nextLine();
			
			if(search.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}else if(dictionary.containsKey(search)) {
				System.out.println(dictionary.get(search));
			}else {
				System.out.println("지원하지 않는 단어입니다.");
			}
			System.out.println();
				
		}
	}

}
