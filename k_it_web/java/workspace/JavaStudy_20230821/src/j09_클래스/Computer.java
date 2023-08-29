package j09_클래스;

public class Computer {
	
	int year;
	String company;
	String cpu;
	int ram;
	String graphic;
	
	void addRam(int gigaByte) {
		int nowRam = ram + gigaByte;
		
		if(nowRam < 32) {
			ram = nowRam;
			System.out.println("램 장착을 완료했습니다.");
			System.out.println("현재 램은 " + nowRam + "GB 입니다.");
		}else {
			ram = 32;
			System.out.println("더 이상 램을 장착할 수 없습니다.");
			System.out.println("현재 램은 32GB 입니다.");
		}
	}
	
	void showInfo() {
		System.out.println("제조년 : " + year);
		System.out.println("제조사 : " + company);
		System.out.println("CPU : " + cpu);
		System.out.println("RAM : " + ram);
		System.out.println("GraphicCard : " + graphic);
		System.out.println();
	}
}
