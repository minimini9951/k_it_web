package j09_클래스;

import java.util.Scanner;

public class SubwayMain {

	public static void main(String[] args) {
		
		/*
		 * 서브웨이
		 * 빵 : 허니오트(3), 파마산오레가노(3), 플랫브레드(3)
		 * 치즈 : 모짜렐라, 슈레드, 아메리칸 치즈
		 * 굽기 : O / X
		 * 야채 : 올리브, 오이, 토마토, 양파, 양상추, 피클
		 * 소스 : 렌치드레싱, 스윗허니언, 스윗칠리, 추천 소스
		 * 세트 : O / X  
		 *
		 * 어서오세요
		 * 빵을 고르세요 : 허니오트(대답이 없을 시 재고가 제일 많은 빵 선택) 
		 * 치즈를 고르세요 : 모짜렐라 
		 * 굽기를 선택하세요: O / X (선택이 없을 시 구워줌)
		 * 뺄 야채를 고르시오 : 오이
		 * 뺄 야채를 고르시오 : 피클
		 * 뺄 야채를 고르시오 : 없음
		 * 소스를 고르시오 : 렌치드레싱(응답이 없을 시 추천소스)
		 * 세트선택하시오: O / X (선택 안할 시 단품)
		 * -> 주문하신 무슨 빵, 무슨 치즈, 무슨 야채 세트가 나왔습니다.
		 *
		 * 빵을 고르세요 : 허니오트
		 * ...
		 * 빵을 고르세요 : 허니오트
		 * ...
		 * 빵을 고르세요 : 허니오트
		 * 빵의 재고가 없습니다. 다른 빵을 고르시오
		 */
		Scanner scanner = new Scanner(System.in);
		
		Subway s1 = new Subway();
		s1.bread = "허니오트, 파마산오레가노, 플랫브레드";
		s1.breadnum1 = 3;
		s1.breadnum2 = 3;
		s1.breadnum3 = 3;
		
		s1.cheese = "모짜렐라, 슈레드, 아메리칸치즈";
		s1.fried = true;
		s1.vegetable = "올리브, 오이, 토마토, 양파, 양상추, 피클";
		s1.sauce = "렌치드레싱, 스윗어니언, 스윗칠리, 추천소스";
		s1.set = false;
		
		System.out.println("어서오세요");
		System.out.println(s1.bread);
		System.out.print("빵을 고르세요 : ");
		String bread = scanner.nextLine();
		if(bread.equals("허니오트")) {
			
		}
		
		
		scanner.close();
	}

}
