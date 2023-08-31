package j11_상속;

public class Human extends Animal {
	
	public Human() {
		System.out.println("Human 기본 생성자 호출");
		System.out.println();
	}
	
	public void study() {
		System.out.println("인간이 공부를 합니다.");
	}
	
	// 오버라이딩 : 재정의 redefine
	@Override
	public void eat() {
		System.out.println("Human에 있는 eat");
		//부모에 있는 기능 불러오기 super.(메소드())
		System.out.println("춤을 춥니다.");
	}
}
