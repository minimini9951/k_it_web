package j19_익명클래스.람다식;

@FunctionalInterface // 메소드를 하나만 사용 람다식으로 전부 구현해 놓으면 사용

public interface StrTest {
	
	public String test(String str);
	
//	public int plus(int num); 람다식을 사용하기 위해서는 추상메소드가 무조건 하나만 있어야 함
}
