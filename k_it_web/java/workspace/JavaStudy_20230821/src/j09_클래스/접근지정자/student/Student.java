package j09_클래스.접근지정자.student;

public class Student {
	
	private String name;
	private int studentyear;
	private int age;
	private String address;
	private String phone;

	public Student() {
	}

	public Student(String name, int studentyear, int age, String address, String phone) {
		this.name = name;
		this.studentyear = studentyear;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
}
