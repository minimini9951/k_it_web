package j08_메소드;

public class Method3 {
	
	/*
	 * 메소드 오버로딩(Overloading)
	 * : 매개변수의 갯수 또는 타입이 다르면 동일한 메소드명을 사용할 수 있다.
	 */
	
	public static void test1() {
		System.out.println("test1 메소드 호출");
	}
	
	public static void test1(int num) {
		System.out.println("test2 메소드 호출");
	}
	
	public static void main(String[] args) {
		test1();
		test1(10);
		}

}
