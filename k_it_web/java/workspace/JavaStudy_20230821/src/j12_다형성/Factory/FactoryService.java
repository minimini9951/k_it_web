package j12_다형성.Factory;

import j11_상속.Factory.Factory;

public class FactoryService{
	
	private Factory factory;

	public FactoryService(Factory factory) {
		this.factory = factory;
	}
	
	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}
}
