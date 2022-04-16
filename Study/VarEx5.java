package Study;

public class VarEx5 {

	public static void main(String[] args) {
		
		//람다표현식
		
		int num1 = 10;
		int num2 = 20;
		
		int result1 = num1 < num2 ? 1 : 2;
		// 변수 = 조건문 ? 참일때의값 : 거짓일때 값;
		// num1 이 num2 보다 작으니 true
		System.out.println(result1);
		
		boolean result2 = num1 < num2 ? true : false;
		// 변수 = 조건문 ? 참일때의 값 : 거짓일때의값;
		System.out.println(result2);
		
		//score가 음수도 안되고 100초과도 안된다.
		int score = -1;
		boolean result;
		result = !(score < 0 || score > 100);
		System.out.println("결과: " + result);
		
		// grade 소문자여도 되고 대문자여도 되는데 a,b,c,A,B,C 만 가능
		char grade = 'a';
		boolean result3;
		result3 = grade == 'a' || grade == 'A';
		
		System.out.println("결과: " + result3);
	}

}





















