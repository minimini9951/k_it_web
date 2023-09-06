package j14_Lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class User {
	
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private String userEmail;
	public static Ubuilder builder() {
		// TODO Auto-generated method stub
		return null;
	}

}
