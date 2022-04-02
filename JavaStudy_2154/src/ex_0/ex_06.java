package ex_0;

public class ex_06 {
	public static void main(String[] args) {
		// 논리연산자
		
		System.out.println((1<3) && (4<5)); 	// && 둘다 참 일 경우 참으로 뜨지만, 하나라도 거짓이라면 거짓으로 뜸
		System.out.println((2<1) && (4<5));
		System.out.println((1<3) || (4<2));		// || 둘중 하나라도 참이 있다면 참으로 뜨지만, 둘다 참이 아니라면 거짓으로 뜸
		System.out.println((2<1) || (4<2));
	}
}
