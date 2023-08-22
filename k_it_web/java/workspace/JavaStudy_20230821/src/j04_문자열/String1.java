package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		System.out.println("안녕\n");
		System.out.println("나는 \"홍길동\"이야");
		
		String address = "부산 진구 가야동";
		int index = address.indexOf("산");
		System.out.println(index);
		
		int index2 = address.indexOf("구");
		System.out.println(index2);
	}

}
