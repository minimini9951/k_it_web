package j15_스태틱.싱글톤;

public class KIA {
	
	private static KIA instance;
	
	private Car[] carArray;
	private int autoCode;
	
	private KIA() {
		carArray = new Car[10];
		autoCode = 20230000;
	}
	
	// 객체 여러개 생성 방지
	// 객체가 생성되고 나면 조건문에 걸려서 새로운 객체 생성 안됨
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public Car produceCar(String model) {
		int carNumber = ++autoCode;
		String company = "KIA";
		
		Car car = Car.builder()
				.model(model)
				.carNumber(carNumber)
				.company(company)
				.build();
		
		if(addCar(car)) {
			return car;
		}
		return null;
	}
	
	private boolean addCar(Car car) {
		for(int i = 0; i < carArray.length; i ++) {
			if(carArray[i] == null) {
				carArray[i] = car;
				System.out.println("주차완료");
				return true;
			}
		}
		System.out.println("주차공간 부족");
		return false;
	}
	
}
