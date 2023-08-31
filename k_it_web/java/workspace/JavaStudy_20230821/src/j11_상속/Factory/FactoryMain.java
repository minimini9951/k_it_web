package j11_상속.Factory;

public class FactoryMain {

	public static void main(String[] args) {
		
//		SamsungFactory samsungFactory = new SamsungFactory(1);
//		samsungFactory.start();
		
		/*
		 * 삼성공장배열 3개 만들고
		 * 각각의 삼성 공장을 모두 가동
		 * 각각의 삼성 공장을 모두 중지
		 * 
		 * LG공장배열 3개 만들고
		 * 모두 가동
		 * 모두 중지
		 */
		
		SamsungFactory[] samsungFactories = new SamsungFactory[3];
		LGFactory[] lgFactories = new LGFactory[3];
		
		SamsungFactory samsung1 = new SamsungFactory(1);
		SamsungFactory samsung2 = new SamsungFactory(2);
		SamsungFactory samsung3 = new SamsungFactory(3);
		samsungFactories[0] = samsung1;
		samsungFactories[1] = samsung2;
		samsungFactories[2] = samsung3;
		
		LGFactory lg1 = new LGFactory(4);
		LGFactory lg2 = new LGFactory(5);
		LGFactory lg3 = new LGFactory(6);
		
		lgFactories[0] = lg1;
		lgFactories[1] = lg2;
		lgFactories[2] = lg3;
		
		for(int i = 0; i< samsungFactories.length; i ++) {
			samsungFactories[i].start();
		}
		for(int i = 0; i< samsungFactories.length; i ++) {
			samsungFactories[i].stop();
		}
		for(int i = 0; i< lgFactories.length; i ++) {
			lgFactories[i].start();
		}
		for(int i = 0; i< lgFactories.length; i ++) {
			lgFactories[i].stop();
		}
	}

}
