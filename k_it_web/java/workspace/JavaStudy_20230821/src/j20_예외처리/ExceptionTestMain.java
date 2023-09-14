package j20_예외처리;

public class ExceptionTestMain {
	
	public static void main(String[] args) {
		ExceptionTest2 exceptionTest2 = new ExceptionTest2();
		
		try {
			exceptionTest2.printArray();
		} catch (Exception e) {
			System.out.println("예외 발생");
			e.printStackTrace();
		}
	}
}
