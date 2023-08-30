package j09_클래스.생성자;

public class ConstructorExMain {

	public static void main(String[] args) {
		ConstructorEx1 constructorEx1 = new ConstructorEx1();
		ConstructorEx1 constructorEx2 = new ConstructorEx1("홍길동");
		System.out.println();
		System.out.println(constructorEx1);
		System.out.println(constructorEx2.name);
	}

}
