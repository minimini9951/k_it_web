package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Gson2 {

	public static void main(String[] args) {
		
		User user = UserService.createUser();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//객체를 Json 변환
		String userJson = gson.toJson(user);
		System.out.println(userJson);
		
		//Json을 객체로 변환 -> fromJson(json문자열, 변환할 객체 클래스)
		User user2 = gson.fromJson(userJson, User.class);
		System.out.println(user2);
		System.out.println(user2.getUsername());
	}

}
