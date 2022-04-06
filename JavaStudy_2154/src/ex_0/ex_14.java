package ex_0;

import java.util.Scanner;

public class ex_14 {

	public static void main(String[] args) { 	
		// 흐름에 따라 뜻을 다르게 하는 문법
		// 주어진 조건을 비교하여 조건에 만족 할 경우 지정된 명령문을 실행,
		// 만족하지 않을 경우 다음 단계의 명령을 실행하는 구문
		
		//score 를 이용한 다중 if-else문 사용하기
	
			/*
			 * 두 수 중 큰 값을 출력하는 프로그램
			 * x, y
			 * 
			 * 두 수를 입력해주세요: ?
			 * 두 수중 큰 값은 ?입니다.
			 */
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 0;
		int y = 0;
		int result = 0;
		
		System.out.println("두 수를 입력해주세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if(x == y) {
			System.out.println("두 수가 같습니다.");
		}else {
			if(x > y) {
				result = x;
				result = y;
			}
			System.out.println("두 수중 큰 값은" + result + "입니다.");
		}
	}
}
