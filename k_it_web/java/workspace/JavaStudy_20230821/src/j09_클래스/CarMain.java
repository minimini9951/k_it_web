package j09_클래스;

public class CarMain {

	public static void main(String[] args) {
		/*
		 * 실습!
		 * Car
		 * 변수
		 * 		company
		 * 		model
		 * 		color
		 * 		km
		 * 
		 * 메소드
		 * 		showInfo - 변수 값을 다 보여주는 메소드
		 * 		colorChange - 1. 레드 2. 블루 3. 그린
		 * 		kmCheck - 출퇴근 -> 10 여행 -> 100
		 * 
		 * 차 2대 만들기
		 * 현대자동차
		 * 소나타
		 * 화이트
		 * 30000
		 * 
		 * 기아
		 * k5
		 * 블랙
		 * 100000
		 */
		
		Car c1 = new Car();
		Car c2 = new Car();
		
		c1.company = "현대자동차";
		c1.model = "소나타";
		c1.color = "화이트";
		c1.km = 30000;
		
		c2.company = "기아";
		c2.model = "k5";
		c2.color = "블랙";
		c2.km = 100000;
		
		c1.showInfo();
		c2.showInfo();
		
		c1.colorChange(2);
		c2.colorChange(3);
		
		c1.kmCheck("출퇴근");
		c2.kmCheck("여행");
		
		c1.showInfo();
		c2.showInfo();
		
	}

}
