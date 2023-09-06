package j14_Lombok;

public class Ubuilder extends UserBuilder{

	@Override
	public UserBuilder userId(String userid) {
		user.setUserId(userid);
		return this;
	}

	@Override
	public UserBuilder userPw(String userpw) {
		user.setUserPw(userpw);
		return this;
	}

	@Override
	public UserBuilder userName(String username) {
		user.setUserName(username);
		return this;
	}

	@Override
	public UserBuilder userAge(int userage) {
		user.setUserAge(userage);
		return this;
	}

	@Override
	public UserBuilder userEmail(String useremail) {
		user.setUserEmail(useremail);
		return this;
	}

}
