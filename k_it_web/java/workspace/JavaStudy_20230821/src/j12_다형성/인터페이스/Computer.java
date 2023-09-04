package j12_다형성.인터페이스;

public class Computer {
	
	private HDMI hdmi;
	
	public Computer(HDMI hdmi) {
		super();
		this.hdmi = hdmi;
	}
	
	public void powerOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
		connectedDisplay();
	}
	
	public void powerOff() {
		disConnectDisplay();
		System.out.println("컴퓨터 전원을 끕니다.");
	}
	
	private void connectedDisplay() {
		System.out.println("출력 장치를 연결합니다.");
		hdmi.connect();
	}
	
	private void disConnectDisplay() {
		System.out.println("출력 장치 연결을 해제합니다.");
		hdmi.disConnect();
	}

}
