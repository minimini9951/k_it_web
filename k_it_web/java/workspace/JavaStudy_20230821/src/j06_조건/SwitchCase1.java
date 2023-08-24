package j06_조건;

public class SwitchCase1 {

	public static void main(String[] args) {
		switch(30) {
		case 10:
			System.out.println("10입니다");
		case 20:
			System.out.println("20입니다");
		case 30:
			System.out.println("30입니다");
		case 40:
			System.out.println("40입니다");
		case 50:
			System.out.println("50입니다");
		}
		
		switch("10") {
		case "10":
			System.out.println("10입니다");
		case "20":
			System.out.println("20입니다");
		case "30":
			System.out.println("30입니다");
		case "40":
			System.out.println("40입니다");
		case "50":
			System.out.println("50입니다");
		}
		// break : 멈추고 빠져나오는 기능
		String num = "10";
		switch(num) {
		case "10":
			System.out.println("10입니다");
		case "20":
			System.out.println("20입니다");
			break;
		case "30":
			System.out.println("30입니다");
		case "40":
			System.out.println("40입니다");
		case "50":
			System.out.println("50입니다");
		default:
			System.out.println("끝이 났습니다");
		}
		
		System.out.println("switchCase 밖");
	}

}
