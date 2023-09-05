package j14_Lombok;

public class StudentMain {
	public static void main(String[] args) {
		
		Student student = new Student();
		Student student2 = new Student(20230001, "홍길동", 2, 18);
		Student student3 = new Student("홍길서");
		
		System.out.println(student2.getAge());
	}
}
