package j15_스태틱.롯데월드;

public class Lotte {
	
	private static Lotte instance;
	
	private  Human[] humanArray;
	private int autoCode;
	
	private Lotte() {
		humanArray = new Human[10];
		autoCode = 20230000;
	}
	
	public static Lotte getInstance() {
		if(instance == null) {
			instance = new Lotte();
		}
		return instance;
	}
	
	public Human produceHuman(String name, int gender) {
		int userCode = ++autoCode;
		
		Human human = Human.builder()
				.name(name)
				.gender(gender)
				.userCode(userCode)
				.build();
		
		if(addHuman(human)) {
			return human;
		}
		return null;
	}
	
	private boolean addHuman(Human human) {
		for(int i = 0; i < humanArray.length; i++) {
			if(humanArray[i] == null) {
				humanArray[i] = human;
				return true;
			}
		}
		System.out.println("정원초과");
		return false;
	}
	
	public void checkMale() {
		for(int i = 0; i < humanArray.length; i++) {
			if(humanArray[i] == null) {
				continue;
			}
			if(humanArray[i].getGender() == 0) {
				System.out.println(humanArray[i].getUserCode() + " / "
						+ humanArray[i].getName() + " / "
						+ humanArray[i].getGender());
			}
		}
	}
	
	public void checkFemale() {
		for(int i = 0; i < humanArray.length; i++) {
			if(humanArray[i] == null) {
				continue;
			}
			if(humanArray[i].getGender() == 1) {
				System.out.println(humanArray[i].getUserCode() + " / "
						+ humanArray[i].getName() + " / "
						+ humanArray[i].getGender());
			}
		}
	}
	
	public void check() {
		int num = 0;
		int male = 0;
		int female = 0;
		for(int i = 0; i < humanArray.length; i++) {
			if(humanArray[i] == null) {
				continue;
			}
			if(humanArray[i] != null) {
				++num;
			}
			if(humanArray[i].getGender() == 0) {
				++male;
			}
			if(humanArray[i].getGender() == 1) {
				++female;
			}
		}
		
		System.out.println("수용가능인원: " + (humanArray.length - num));
		System.out.println("남자 인원: " + male);
		System.out.println("여자 인원: " + female);
	}
	
	public void remainHuman() {
	    int remainingCount = 0;
	    for (Human human : humanArray) {
	        if (human == null) {
	            remainingCount++;
	        }
	    }
	    System.out.println("추가수용 가능 인원 : " + remainingCount);
	}

}
