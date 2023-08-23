package j03_연산자;

public class Operation5 {

	public static void main(String[] args) {
		/*
		 * 점수 score
		 * 결과 result
		 * 
		 * 1. 점수가 89보다 크면 (A학점)
		 * 2. 점수가 79보다 크면 (B학점)
		 * 3. 점수가 69보다 크면 (C학점)
		 * 4. 점수가 59보다 크면 (D학점)
		 * 5. 나머지는 (F학점)
		 * 6. 점수가 0보다 작거나 100보다 크면 (계산불가)
		 */
		
		int score = 78;
		// String 값은 null로 초기화 할 것
		
		// 내 풀이
		String result = null;
		result =   (score <= 100 && score > 89) ? "(A학점)"
						: (score <= 89 && score > 79) ? "(B학점)"
						: (score <= 79 && score > 69) ? "(C학점)"
						: (score <= 69 && score > 59) ? "(D학점)"
						: (score <= 59 && score >= 0) ? "(F학점)"
						: "계산불가";
						
		System.out.println(result);
		
		// 강사 풀이
		int score2 = 85;
		String result2 = null;
		result2 = score < 0 || score2 > 100 ? "계산불가"
						: score2 > 89 ? "A학점"
						: score2 > 79 ? "B학점"
						: score2 > 69 ? "C학점"
						: score2 > 59 ? "D학점"
						: "F학점";
						
		System.out.println(result2);
		
	}

}
