package j09_클래스.생성자;

public class ConstructorEx1 {
	
	String name;
	int age;
	//NoArgsConstructor
	public ConstructorEx1() {
		System.out.println("기본 생성자 호출");
	}
	//RequiredArgsConstructor
	public ConstructorEx1(String name) {
		System.out.println("매개변수 : " + name);
		System.out.println("name을 매개변수로 받는 생성자");
		this.name = name;
	}
	//RequiredArgsConstructor
	public ConstructorEx1(int age) {
		System.out.println("매개변수 : " + age);
		System.out.println("age를 매개변수로 받는 생성자");
		this.age = age;
	}
	//ALLArgsConstructor
	public ConstructorEx1(String name, int age) {
		System.out.println("매개변수 : " + name);
		System.out.println("매개변수 : " + age);
		System.out.println("전체 생성자");
		this.name = name;
		this.age = age;
	}
}
