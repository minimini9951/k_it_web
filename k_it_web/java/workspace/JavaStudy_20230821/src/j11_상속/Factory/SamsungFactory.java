package j11_상속.Factory;

public class SamsungFactory extends Factory {

	public SamsungFactory(int FactoryNumber) {
		super(FactoryNumber);
		System.out.println("자식 생성자 호출");
	}

}
