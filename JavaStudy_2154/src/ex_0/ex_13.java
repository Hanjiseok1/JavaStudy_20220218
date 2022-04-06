package ex_0;

import java.util.Scanner;

public class ex_13 {

	public static void main(String[] args) { 	
		// 흐름에 따라 뜻을 다르게 하는 문법
		// 주어진 조건을 비교하여 조건에 만족 할 경우 지정된 명령문을 실행,
		// 만족하지 않을 경우 다음 단계의 명령을 실행하는 구문
		
		//score 를 이용한 다중 if-else문 사용하기
			Scanner sc = new Scanner(System.in); // 임포트 불러오기
			
			System.out.print("점수 입력: "); // 실행문 넣기
			
			int score = sc.nextInt(); // 출력문 넣기
			
			if(score >= 90) { // 조건문
				System.out.println("A점수 입니다."); // 실행문 넣기
			}else if(score >= 80) { // 조건문
				System.out.println("B점수 입니다."); // 실행문 넣기
			}else { // 조건문
				System.out.println("F점수 입니다."); // 실행문 넣기
			}
		
	}
}
