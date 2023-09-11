package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {
	public static void main(String[] args) {
		
		Student student1 = new Student("홍길동");
		Student student2 = new Student("홍길서");
		Student student3 = new Student("홍길남");
		Student student4 = new Student("홍길북");
		
		/*
		 * studentList 라는 리스트 만들고
		 * student 1 2 3 4 추가
		 */
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student1);
		list.add(student2);
		list.add(student3);
		list.add(student4);
		
		System.out.println(list);
		
		Student[] students = {student1, student2, student3, student4};
		
		list.addAll(Arrays.asList(students));
		System.out.println(list);
		
		List<String> list3 = new ArrayList<String>();
		
		/*
		 * studentList에서 홍길동 삭제(1개만)
		 */
		
		for(Student student : list) {
			if(student.getName().equals("홍길동")) {
				list.remove(student);
				break;
			}
		}
		System.out.println(list);
	}
}
