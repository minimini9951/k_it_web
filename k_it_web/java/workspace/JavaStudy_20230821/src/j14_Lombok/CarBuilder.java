package j14_Lombok;

public abstract class CarBuilder {
	
	protected Car car;
	
	public Car build() {
		return car;
	}
	
	public CarBuilder builder() {
		car = new Car();
		return this;
	}
	
	public abstract CarBuilder company(String model);
	public abstract CarBuilder model(String model);
	public abstract CarBuilder color(String model);
}
