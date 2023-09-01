package j12_추상;

public abstract class Animal {
	
//	public void move() {
//		System.out.println("동물이 움직입니다.");
//	}
	
	public abstract void move();
	// 추상 메소드가 하나라도 있으면 무조건 추상 클래스로 선언
	
	public void eat() {
		System.out.println("동물이 밥을 먹습니다.");
	}
	// 일반 메소드 사용이 가능함
	
	public abstract void run();
	
	public abstract void jump();
	
	public abstract void sleep();
}
