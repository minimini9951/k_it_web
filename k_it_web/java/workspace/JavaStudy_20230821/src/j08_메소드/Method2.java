package j08_메소드;

public class Method2 {
	
	// 메소드의 종류
	
	// 반환이 없고 매개변수도 없는 메소드
	// 리턴값이 없을 때 리턴타입은 void
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	// 반환이 없고 매개변수가 하나인 메소드
	public static void test2(int num) {
		System.out.println("test2 메소드 호출");
		System.out.println("num = " + num);
	}
	
	// 반환이 없고 매개변수가 세개인 메소드
	public static void test3(String name, int weight, int height) {
		System.out.println("test3 메소드 호출");
		System.out.println("name = " + name);
		System.out.println("weight x height = " + (weight * height));
	}
	
	// 반환이 있고 매개변수가 하나인 메소드
	public static String test4(String name) {
		System.out.println("test4 메소드 호출");
		return name;
	}
	
	// 반환이 있고 매개변수가 없는 메소드
	public static int test5() {
		return 100;
	}

	public static void main(String[] args) {
		
		test1();
		test2(10);
		test3("홍길동", 70, 170);
		System.out.println(test4("홍길동"));
		System.out.println(test5());
	}

}
