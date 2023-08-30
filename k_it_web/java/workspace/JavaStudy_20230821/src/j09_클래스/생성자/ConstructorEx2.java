package j09_클래스.생성자;

// @RequiredArgsConstructor
// @AllArgsConstructor
// @data
// @RestController
// @Controller
// @Service

public class ConstructorEx2 {
	
	String top;
	String color;
	int size;
	
	public ConstructorEx2() {
	}
	
	public ConstructorEx2(String top) {
		this.top = top;
	}
	
	public ConstructorEx2(String top, String color) {
		this.top = top;
		this.color = color;
	}
	
	public ConstructorEx2(int size) {
		this.size = size;
	}
	
	public ConstructorEx2(String top, String color, int size) {
		this.top = top;
		this.color = color;
		this.size = size;
	}
	
	
	
}
