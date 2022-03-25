package a_공부;

public class UserTest {

	public static void main(String[] args) {
		User user = new PersonalUser("username", "password", "name", 0, 0, 0);
		user.setUsername("jiseok");
		user.setPassword("1234");
		System.out.println(user.login("jiseok", "1234"));
	}

}
