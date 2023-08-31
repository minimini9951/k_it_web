package j11_상속.Factory;

public class Factory {
	
	private int factoryNumber;
	
	public Factory(int FactoryNumber) {
		this.factoryNumber = FactoryNumber;
	}
	
	public void start() {
		System.out.println(factoryNumber + "공장을 가동합니다.");
	}
	
	public void stop() {
		System.out.println(factoryNumber + "공장을 중지합니다.");
	}
}
