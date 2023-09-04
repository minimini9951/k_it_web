package j12_다형성2;

public class MessengerMain {

	public static void main(String[] args) {
		
		KakaoTalk kakaoTalk = new KakaoTalk();
		FaceBookMessenger faceBookMessenger = new FaceBookMessenger();
		MessengerMiddleware messengerMiddleware = new MessengerMiddleware(kakaoTalk);
		
		/*
		 * messengerMiddleware.sendMessage();
		 * - > 카카오톡에서 메세지를 보냅니다.
		 * - > 페이스북에서 메세지를 보냅니다.
		 * 
		 * messengerMiddleware.receiveMessage();
		 * - > 카카오톡에서 메세지를 받습니다.
		 * - > 페이스북에서 메세지를 받습니다.
		 * 
		 * messengerMiddleware.runAddOns();
		 * - > 카카오톡에서 선물을 보냅니다.
		 * - > 페이스북에서 전화를 겁니다.
		 */
		
		messengerMiddleware.sendMessage();
		messengerMiddleware.receiveMessage();
		messengerMiddleware.runAddOns();
		
	}

}
