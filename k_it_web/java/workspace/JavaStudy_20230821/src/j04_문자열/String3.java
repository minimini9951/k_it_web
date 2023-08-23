package j04_문자열;

public class String3 {

	public static void main(String[] args) {
		
		String address = "부산 서구 부민동";
		/*
		 * "부"의 위치를 찾는 방법을 활용하여
		 * "부산 서구"를 출력
		 */
		
		int index = address.indexOf("부");
		System.out.println(index);
		
		int lastIndex = address.lastIndexOf("부");
		System.out.println(lastIndex);
		
		String subAddress = address.substring(index, lastIndex - 1);
		System.out.println(subAddress);
		
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		
		String replaceAllAddress = address.replaceAll("부민동", "연산동");
		System.out.println(replaceAllAddress);
	}

}
