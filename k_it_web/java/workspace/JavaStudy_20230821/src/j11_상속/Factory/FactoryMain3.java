package j11_상속.Factory;

public class FactoryMain3 {

	public static void main(String[] args) {
		
		Factory[] factories = new Factory[6];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LGFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LGFactory(2);
		factories[4] = new LGFactory(3);
		factories[5] = new SamsungFactory(3);
		
		System.out.println();
		/*
		 * 삼성 1공장을 가동합니다.
		 * 삼성 스마트폰을 만듭니다.
		 * 
		 * 엘지 1공장을 가동합니다.
		 * 엘지 스마트 TV를 만듭니다.
		 * ...
		 * 
		 * 엘지 3공장을 가동합니다.
		 * 엘지 스마트TV를 만듭니다.
		 * 
		 * 삼성 3공장을 가동합니다.
		 * 삼성 스마트폰을 만듭니다.
		 */
		
		for(int i = 0; i < factories.length; i++) {
			factories[i].start();
			if(factories[i] instanceof SamsungFactory) {
				((SamsungFactory)factories[i]).produceSmartPhone();
			}else if(factories[i] instanceof LGFactory) {
				((LGFactory)factories[i]).produceSmartTV();
			}
			System.out.println();
		}
	}

}
