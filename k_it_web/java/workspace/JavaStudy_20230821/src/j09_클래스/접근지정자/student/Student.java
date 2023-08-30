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
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(studentyear);
		System.out.println(age);
		System.out.println(address);
		System.out.println(phone);
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getStudentyear() {
		return studentyear;
	}

	public void setStudentyear(int studentyear) {
		this.studentyear = studentyear;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
