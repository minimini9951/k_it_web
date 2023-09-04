package j12_다형성.Factory;

import j11_상속.Factory.Factory;
import j11_상속.Factory.LGFactory;
import j11_상속.Factory.SamsungFactory;

public class FactoryMain {

	public static void main(String[] args) {
		
		Factory factory = new Factory(1);
		SamsungFactory samsungFactory = new SamsungFactory(1);
		LGFactory lgFactory = new LGFactory(1);
		
		FactoryService factoryService = new FactoryService(lgFactory);
		FactoryService factoryService2 = new FactoryService(samsungFactory);
		
		/*
		 * factoryService.factoryStart();
		 * - > 삼성 1공장을 가동합니다.
		 * 
		 * factoryService.factoryStop();
		 * - > 삼성 1공장을 중지합니다.
		 */
		
		factoryService.factoryStart();
		factoryService2.factoryStart();
		
		factoryService.factoryStop();
		factoryService2.factoryStop();
	}

}
