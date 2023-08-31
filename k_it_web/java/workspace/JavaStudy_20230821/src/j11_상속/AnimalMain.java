package j11_상속;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tiger tiger = new Tiger();
		
		animal.move();
		System.out.println();
		human.move();
		System.out.println();
		tiger.move();
		System.out.println();
		human.study();
		
		human.eat();
	}

}
