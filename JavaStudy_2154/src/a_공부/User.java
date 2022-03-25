package a_공부;

public class User {
	private String username;
	private String password;
	private String name;
	private int age;
	private int Account;
	private int AccountPassword;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAccount() {
		return Account;
	}
	public void setAccount(int account) {
		Account = account;
	}
	public int getAccountPassword() {
		return AccountPassword;
	}
	public void setAccountPassword(int accountPassword) {
		AccountPassword = accountPassword;
	}
	public boolean login(String username, String password) {
	    if(this.username.equals(username) && this.password.equals(password)) {
	        return true;
	    }
	    return false;
	}
	
	public User(String username, String password, String name, int age, int account, int accountPassword) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.age = age;
		Account = account;
		AccountPassword = accountPassword;
		
		
	}
}


