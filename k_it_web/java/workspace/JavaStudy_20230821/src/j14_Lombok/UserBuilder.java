package j14_Lombok;

public abstract class UserBuilder {
	
	protected User user;
	
	public User build() {
		return user;
	}
	
	public UserBuilder builder() {
		user = new User();
		return this;
	}
	
	public abstract UserBuilder userId(String user);
	public abstract UserBuilder userPw(String user);
	public abstract UserBuilder userName(String user);
	public abstract UserBuilder userAge(int user);
	public abstract UserBuilder userEmail(String user);
}
