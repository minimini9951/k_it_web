package j15_스태틱.롯데월드;

public class SingleToneMain {
	public static void main(String[] args) {
		
		Lotte lotte = Lotte.getInstance();
		
		System.out.println(lotte.produceHuman("홍길동", 0));
		System.out.println(lotte.produceHuman("홍길", 0));
		System.out.println(lotte.produceHuman("홍", 0));
		System.out.println(lotte.produceHuman("홍길서", 1));
		System.out.println(lotte.produceHuman("홍서", 1));
		
		lotte.remainHuman();
	}
}
