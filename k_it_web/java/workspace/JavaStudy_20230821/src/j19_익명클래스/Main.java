package j19_익명클래스;

public class Main{

	public static void main(String[] args) {
		
		AbstractTest abstractTest = new AbstractTestImpl();
		
		abstractTest.showData("홍길동");
		abstractTest.add(10, 20);	
		
		AbstractTest abstractTest2 = new AbstractTest() {
			
			@Override
			public void showData(String data) {
				System.out.println("1");
			}
			
			@Override
			public void add(int num1, int num2) {
				System.out.println("2");
			}
		};
		abstractTest2.showData("hi");
		abstractTest2.add(1, 2);
	}

}
