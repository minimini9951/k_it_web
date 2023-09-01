package j12_추상;

public abstract class Human extends Animal{

	@Override
	public void move() {
		System.out.println("사람이 움직입니다.");
	}

	@Override
	public void run() {
		System.out.println("사람이 달리기를 합니다");
	}

	@Override
	public void jump() {
		System.out.println("사람이 점프를 합니다.");
	}
	
}
