package a13_인터페이스2.service;

import java.util.Scanner;

import a13_인터페이스2.data.UserData;
import a13_인터페이스2.model.User;

public class UserServiceImpl implements UserService {
	private final UserData userData;
	private final Scanner scanner;
	public UserServiceImpl() {
		scanner = new Scanner(System.in);
		System.out.println("관리할 회원의 수를 입력해주세요: "); 
		User[] users = new User[scanner.nextInt()];
		//회원을 저장할 배열의 크기를 지정하고 생성된 배열을 UserData 객체의 users 배열 변수에 set하는 것	
		this.userData =UserData.getInstance(users);
		scanner.nextInt();
		//위의 nextInt()후에 버퍼에 저장된 엔터를 날려주기 위함.
	}
	
	@Override
	public void addUser(User user) {
		User[] users = userData.getUsers(); //user배열 주소 가져옴.
		for(int i = 0; i < users.length; i++) { //user배열에서 빈 공간이 있으면 입력한 user객체를 배열에 저장하겟다.
			if(users[i] == null) {
				users[i] = user;
				break;
			}
		}
	}

	@Override
	public User[] getUsers() {
		return userData.getUsers();
	}

	@Override
	public User getUser(String username) {
		//반복문을 사용해서 배열에 들어있는 user 객체들 중에
		//매개변수(우리가 찾고자 하는 username을 가진)를 가진 user객체를 return
		return null;
	}
	
}
