package j09_클래스;

public class Car {
	
	String company;
	String model;
	String color;
	int km;
	
	public Car() {
		System.out.println("생성자 호출");
	}
	/*
	 * 기본 생성자의 특징
	 * 1. 생성자는 무조건 클래스명과 동일하다.
	 * 2. 생성자는 무조건 주소값을 리턴한다.
	 * 3. 기본 생성자는 생략이 가능하다.
	 */
	
	void kmCheck(String str) {
		if(str.equals("출퇴근")) {
			km += 10;
		}else if(str.equals("여행")) {
			km += 100;
		}
	}
	
	void colorChange(int num) {
		if(num == 1) {
			color = "레드";
		}else if(num == 2) {
			color = "블루";
		}else if (num == 3) {
			color ="그린";
		}
	}
	
	void showInfo() {
		System.out.println("제조사 : " + company);
		System.out.println("차종 : " + model);
		System.out.println("색상 : " + color);
		System.out.println("주행거리 : " + km);
		System.out.println();
	}

}
