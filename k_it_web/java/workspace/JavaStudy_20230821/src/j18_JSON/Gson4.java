package j18_JSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Gson4 {
	public static void main(String[] args) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		//맵이나 객체가 없을 시 바로 json으로 변경
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("name", "홍길동");
		jsonObject.addProperty("phone", "010-3300-4698");
		jsonObject.addProperty("address", "부산광역시 진구");
		
		String json = gson.toJson(jsonObject);
		System.out.println(json);
		
		JsonObject jsonObject2 = gson.fromJson(jsonObject, JsonObject.class);
		System.out.println(jsonObject2);
		
		User user = UserService.createUser();
		Gson gson2 = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
		String json2 = gson2.toJson(user);
		System.out.println(json2);
	}
}
