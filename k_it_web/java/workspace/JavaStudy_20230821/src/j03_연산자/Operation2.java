package j03_연산자;

public class Operation2 {

	public static void main(String[] args) {
		
		// 관계연산자
		
		System.out.println(10 > 5);
		boolean flag = 10 > 5;
		System.out.println(flag);
		
		int num = 7;
		
		boolean result = num < 7;
		System.out.println(result);
		
		boolean result2 = num != 7;
		System.out.println(result2);
		
		boolean result3 = num == 10;
		System.out.println(result3);
		
		/*
		 *  논리연산 : boolean 끼리 연산 하는 것
		 *  
		 *  And 연산(&&) - 곱
		 *  t && t = t
		 *  t && f = f
		 *  f && f = f
		 *  
		 *  or 연산 (||) - 합
		 *  t || t = t
		 *  t || f = t
		 *  f || f = f
		 *  
		 *  Not 연산 (!) - 부정
		 *  !t = f
		 *  !f = t
		 *  
		 *  !(t && f) = t
		 */
		
	}

}
