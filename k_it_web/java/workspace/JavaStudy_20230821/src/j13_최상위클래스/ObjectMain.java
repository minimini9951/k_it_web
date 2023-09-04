package j13_최상위클래스;

import j09_클래스.접근지정자.student.Student;
import j10_배열.Array1;
import j11_상속.Animal;
import j11_상속.Human;

public class ObjectMain {

	public static void main(String[] args) {
		Human human = new Human();
		Animal human2 = new Human();
		Object human3 = new Human();
		
		Object[] objects = new Object[5];
		objects[1] = new Human();
		objects[1] = new Student();
		objects[1] = new Animal();
		objects[1] = new Array1();
	}

}
