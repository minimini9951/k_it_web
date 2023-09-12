package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserService {
	
	public static User createUser() {
		
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"축구", "야구", "농구", "골프"}));
		
		User user = User.builder()
				.userCode(1)
				.username("gildong")
				.password("1234")
				.name("gildong")
				.email("gildong@")
				.address("부산광역시 진구")
				.phone("010-1111-2222")
				.hobby(hobby)
				.build();
        
        return user;
	}
	
	public static void main(String[] args) {
		createUser();
	}
	
	
}
