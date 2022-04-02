package ex_0;

import java.util.Scanner;

public class ex_08 {
	public static void main(String[] args) {
		
//		System.out.println("공부");
//		
//		String name = "한지석";
//		System.out.println(name);
//		
//		System.out.println(name + "입니다.");
		
		
//		1. Scanner 도구 불러오기
		Scanner scan = new Scanner(System.in);
		
//		2. 입력명령어 사용하기
//		int num = scan.nextInt();
//		System.out.println(num);
		
		// 3. 문자열 사용하기
		System.out.print("이름: ");
		String name = scan.next();
		System.out.println("제 이름은 " + name + " 입니다.");
	}
}
