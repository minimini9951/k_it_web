package j15_스태틱;

public class StaticMain {
	
	public static void main(String[] args) {
		
		StaticTest staticTest = new StaticTest();
		StaticTest.name = "홍길동";
		
		System.out.println(StaticTest.name);
		
		StaticTest staticTest2 = new StaticTest();
		System.out.println(staticTest2.name);
		
		staticTest2.name = "홍길서";
		System.out.println(staticTest2.name);
		System.out.println(staticTest.name);
		
		StaticTest.name = "홍길동";
		
		staticTest2.printTest();
		StaticTest.printTest();
	}
}
