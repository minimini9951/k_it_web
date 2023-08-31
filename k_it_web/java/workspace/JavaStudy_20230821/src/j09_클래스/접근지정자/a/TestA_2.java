package j09_클래스.접근지정자.a;

public class TestA_2 {
	
	int ta2;
	
	public void testA2() {
		System.out.println("TestA-2 메소드 호출");
		//TestA 불러옴
		TestA testA = new TestA();
		//testA의 ta1값에 문자열 입력
		testA.ta1 = "테스트 A-2에서 값 주입";
		//testA의 testA1메소드 실행
		testA.testA1();
		//testA의 ta1값 출력
		System.out.println(testA.ta1);
	}
}
