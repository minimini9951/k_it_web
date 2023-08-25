package j07_반복;

public class For3 {

	public static void main(String[] args) {
		
		String str = "abcdefghijk";
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(i , i + 1));
		}
		
		// 결합도는 낮추고 (변수통일) 응집도는 높인다. (비슷한 용도의 변수 위치 통일)
	}

}
