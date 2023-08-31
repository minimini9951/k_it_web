package j09_클래스.접근지정자.student;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * Student 생성하고 name에 홍길동 값 주입
		 * 
		 * 전체생성자 만들기
		 * 홍길동 / 3 / 18 / 부산 동래구 / 010-1234-5678
		 */
		
		Student student1 = new Student("홍길동", 3, 18, "부산 동래구", "010-3300-4698");
		Student student2 = new Student("오재근", 2, 17, "부산 금정구", "010-1234-5678");
		Student student3 = new Student("성시원", 1, 16, "부산 진구", "010-1111-2222");
		
		/*
		 * 기본 생성자는 생략이 가능함.
		 * 하지만 생성자 오버로딩이 되면
		 * 기본 생성자를 사용하려면 꼭 명시를 해줘야 한다.
		 */
		
		
		student1.showInfo();
		System.out.println(student1.getName());
		
		student2.showInfo();
		student3.showInfo();
	}

}
