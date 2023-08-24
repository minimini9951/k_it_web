package j06_조건;

public class If3 {

	public static void main(String[] args) {
		int score = 85;
		String result = null;
		
		if(score < 0 || score > 100) {
			result = "계산불가";
		} else if(score > 89) {
			result = "A학점";
		} else if(score > 79) {
			result = "B학점";
		} else if(score > 69) {
			result = "C학점";
		} else if(score > 59) {
			result = "D학점";
		} else 
			result = "F학점";
		System.out.println(result);
	}

}
