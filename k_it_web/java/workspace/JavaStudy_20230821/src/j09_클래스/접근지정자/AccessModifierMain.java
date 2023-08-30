package j09_클래스.접근지정자;

import j09_클래스.접근지정자.a.TestA;
import j09_클래스.접근지정자.a.TestA_2;
import j09_클래스.접근지정자.b.TestB;

public class AccessModifierMain {

	public static void main(String[] args) {
		
		TestA testA = new TestA();
		// 접근 지정자를 따로 작성하지 않으면 default값으로 설정함
		
		TestA_2 testA_2 = new TestA_2();
		testA_2.testA2();
		
		TestB testB = new TestB();
		
		
	}

}
