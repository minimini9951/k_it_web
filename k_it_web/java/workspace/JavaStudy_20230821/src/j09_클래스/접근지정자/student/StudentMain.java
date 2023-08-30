package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * Student 생성하고 name에 홍길동 값 주입
		 * 
		 * 전체생성자 만들기
		 * 홍길동 / 3 / 18 / 부산 동래구 / 010-1234-5678
		 */
		
		Student student = new Student("홍길동", 3, 18, "부산 동래구", "010-1234-5678");
		
		/*
		 * 기본 생성자는 생략이 가능함.
		 * 하지만 생성자 오버로딩이 되면
		 * 기본 생성자를 사용하려면 꼭 명시를 해줘야 한다.
		 */
		
		Student student2 = new Student();
	}

}
