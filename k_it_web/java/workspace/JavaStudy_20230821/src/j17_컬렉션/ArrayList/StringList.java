package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringList {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("java");
		list.add("python");
		list.add("C");
		list.add("python");
		list.add("html");
		
		list.add(2, "mariaDB");
		
		System.out.println(list);
		
		System.out.println(list.size());
		
		String subject = list.get(0);
		System.out.println(subject);
		
		int index = list.indexOf("mariaDB");
		System.out.println(index);
		
		list.set(3, "c++");
		System.out.println(list);
		
		ArrayList<String> templist = new ArrayList<String>();
		templist.add("python");
		templist.add("c++");
		templist.add("spring");
		
		boolean contains = templist.contains("python");
		System.out.println(contains);
		System.out.println(templist.contains("java"));
		
		boolean containsAll = list.containsAll(templist);
		System.out.println(containsAll);
		
		boolean result = list.remove("python");
		System.out.println(list);
		list.add("python");
		list.add("python");
		System.out.println(list);
		
//		list.removeAll(templist);
//		System.out.println(list);
		
		list.retainAll(templist);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		
		//배열을 리스트에 넣기
		String[] names = {"홍길동", "홍길서", "홍길남"};
		
		List<String> asList = Arrays.asList(names);
		list.addAll(asList);
		System.out.println(list);
		
		//반복문을 통해 list에 있는 값 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		for(String name : list) {
			System.out.println(name);
		}
		
		
	}
}
