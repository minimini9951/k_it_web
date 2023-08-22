package j02_상수와형변환;

public class Cast {

	public static void main(String[] args) {
		
		// 업캐스팅(묵시적 형변환, 자동형변환)
		char a = 'A';
		int b = a;
		double c = b;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
		
		c = a;
		System.out.println(c);
		
		// 다운캐스팅(명시적 형변환, 수동형변환)
		int d = (int)c;
		char e = (char)d;
		
		System.out.println(d);
		System.out.println((char)d);
		System.out.println(e);
		
	}

}
