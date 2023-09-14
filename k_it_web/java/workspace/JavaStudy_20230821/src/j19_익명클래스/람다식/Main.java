package j19_익명클래스.람다식;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Math<Integer, Integer> plusMath = new Math<Integer, Integer>() {
			
			@Override
			public double calc(Integer value1, Integer value2) {
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath.calc(10, 20));
		
		/*
		 * plusMath2.calc("10.5", "20.7");
		 * 
		 * 리턴 : 홍길동
		 */
		
		Math<Double, Double> plusMath2 = new Math<Double, Double>() {
			
			@Override
			public double calc(Double value1, Double value2) {
				return value1 + value2;
			}
		};
		
		System.out.println(plusMath2.calc(10.5, 20.7));
		
		//람다식
		Math<Integer, Integer> plusMath3 = (v1, v2) -> v1 + v2;
		
		System.out.println(plusMath3.calc(20, 30));
		
		Math<Double, Double> plusMath4 = (v1, v2) -> {
			System.out.println("안녕");
			return(v1 + v2);
		};
		
		System.out.println(plusMath4.calc(20.3, 30.3));
	}

}
