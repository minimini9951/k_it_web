package j08_메소드;

public class Method1 {

	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 20;
		
		int sum = add(num1, num2); // 인수
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	// 인수와 매개변수의 이름은 달라도 됨
	public static int add(int num1, int num2) { // 매개변수
		int result = num1 + num2;
		return result;
	}
}
