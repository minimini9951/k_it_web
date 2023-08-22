package j01_출력;

public class Myinfo2 {

	public static void main(String[] args) {
		boolean flag;
		flag = true;
		flag = false;
		
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println();
		
		// char형을 이어서 출력하고 싶으면 가장 앞에 ""를 넣어줘야함
		System.out.println("" + name1 + name2 + name3);
	}

}
