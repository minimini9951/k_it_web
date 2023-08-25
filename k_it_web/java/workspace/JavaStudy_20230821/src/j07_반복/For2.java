package j07_반복;

public class For2 {

	public static void main(String[] args) {
		/*
		 * 구구단
		 * 2단
		 * 		2 X 1 = 2
		 * 		2 X 2 = 4
		 * 		2 X 3 = 6
		 * 		...
		 * 		2 X 9 = 18
		 * 3단
		 * 		3 X 1 = 3
		 * 		3 X 2 = 6
		 * 		...
		 * 		3 X 9 = 27
		 * 9단
		 */
		
		for(int i = 0; i < 8; i++) {
			System.out.println((i + 2) + "단");
			for(int j = 0; j < 9; j++) {
				System.out.println("\t" + (i + 2) + " X " + (j + 1) + " = " 
									+ (i + 2) * (j + 1));
			}
		}
	}

}
