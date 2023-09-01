package j11_상속.Factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int FactoryNumber) {
		super(FactoryNumber);
		System.out.println("삼성 생성자 호출");
	}
	
	@Override
	public void start() {
		System.out.print("삼성 ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("삼성");
		super.stop();
	}
	
	public void produceSmartPhone() {
		System.out.println("삼성 스마트폰을 만듭니다.");
	}
	
}
