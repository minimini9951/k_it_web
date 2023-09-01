package j11_상속.Factory;

public class FactoryMain2 {

	public static void main(String[] args) {
		/*
		 * 배열 1개만 만들고
		 * 
		 * 배열 1개를 반복을 돌렸을 때
		 * 삼성 1공장을 가동합니다.
		 * 엘지 1공장을 가동합니다.
		 * 삼성 2공장을 가동합니다.
		 * 엘지 2공장을 가동합니다.
		 */
		
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
		}
	}

}
