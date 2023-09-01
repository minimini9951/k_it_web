package j11_상속.Factory;

public class LGFactory extends Factory{

	public LGFactory(int FactoryNumber) {
		super(FactoryNumber);
		System.out.println("엘지 생성자 호출");
	}
	
	@Override
	public void start() {
		System.out.print("엘지 ");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.print("엘지 ");
		super.stop();
	}
	
	public void produceSmartTV() {
		System.out.println("LG 스마트TV를 만듭니다.");
	}
}
