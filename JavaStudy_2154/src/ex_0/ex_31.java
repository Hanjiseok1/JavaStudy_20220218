package ex_0;

public class ex_31 {

	public static int outputNumber() {
		return 10;
	}
	
	public static void showName() {
		String name = "한지석";
		System.out.println("이름: " + name);
	}
	
	public static int outputNumber2(int number) {
		return number;
	}
	
	public static int outputNumber3(int number) {
		if(number % 2 == 0) {
			return 0;
		}else {
			return 1;
		}
	}
	
	public static void showName2(String name) {
//		if(name == null) {
//			return;
//		}
		System.out.println(name);
	}
	
	public static void main(String[] args) {	
		int number = outputNumber();
		System.out.println(number);
		showName();
		showName2(null);
		int number2 = outputNumber2(100);
		System.out.println(number2);
	}
	
}
