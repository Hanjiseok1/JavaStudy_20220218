package ex_0;

import java.util.Scanner;

public class ex_16 {

	public static void main(String[] args) { 	
		// 흐름에 따라 뜻을 다르게 하는 문법
		// 주어진 조건을 비교하여 조건에 만족 할 경우 지정된 명령문을 실행,
		// 만족하지 않을 경우 다음 단계의 명령을 실행하는 구문
		
		/*
		 * 세 수중에 가장 큰 수를 찾는 문제
		 *
		 * 세 수를 입력해 주세요: 1 3 5
		 * 
		 * 가장 큰 수는 5입니다.
		 * 세수 모두 같습니다.
		 */
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int z = 0;
		int result = 0;
		
		System.out.println("세 수를 입력하세요: ");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		if(x == y && y == z) { // 논리연산자
			System.out.println("세 수 모두 같습니다.");
		}else {
			if(x > y) {
				result = x;
			}else {
				result = y;
			}
			if(result < z) {
				result = z;
			}
			System.out.println("가장 큰 수는" + result + "입니다.");
		}
	}
}
