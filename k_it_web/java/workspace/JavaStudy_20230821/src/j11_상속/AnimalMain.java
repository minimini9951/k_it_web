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
		
		animal.move();
		animal.eat();
		System.out.println();
		
		Animal animal1 = new Human();
		
		animal1.move();
		
		((Human)animal1).study();
		System.out.println();
		((Human)animal1).eat();
		// ((Tiger)animal1).attack();
		// ((Human)animal).study();
	}

}
