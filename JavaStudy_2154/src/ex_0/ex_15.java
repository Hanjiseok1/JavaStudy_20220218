package ex_0;

import java.util.Scanner;

public class ex_15 {

	public static void main(String[] args) { 	
		// 흐름에 따라 뜻을 다르게 하는 문법
		// 주어진 조건을 비교하여 조건에 만족 할 경우 지정된 명령문을 실행,
		// 만족하지 않을 경우 다음 단계의 명령을 실행하는 구문
		
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		String result = null;
		
		System.out.println("입력: ");
		x = scanner.nextInt();
		
		if(x == 0) {
			result = "0";
		}else {
			if(x % 2 == 0) {
				result = "짝수";
			}else {
				result = "홀수";
			}
			System.out.println(result + " 입니다. ");
		}
		
	}
}
