package j12_추상;

public class AnimalMain {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		// 추상클래스는 생성이 안됨.
		
		Animal animal = new HumanImpl();
		animal.move();
		animal.run();
		animal.eat();
	}

}
