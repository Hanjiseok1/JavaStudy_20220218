package ex_0;

import java.util.Scanner;

public class ex_29 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		char select = ' ';
		
		while(true) {
			System.out.println("[학생관리 프로그램]");
			System.out.println("1. 학생 주소조회");
			System.out.println("2. 학생 성적조회");
			System.out.println("3. 학생 기본정보 조회");
			System.out.println("q. 프로그램 종료");
			System.out.println();
			System.out.print("명령을 선택하세요: ");
			select = scanner.next().charAt(0);
			
			if(select == '1') {
				System.out.println("1.학생주소 조회합니다");
			}else if(select == '2') {
				System.out.println("2.학생성적 조회합니다.");
			}else if(select == '3') {
				System.out.println("3.학생 기본정보 조회합니다.");
			}else if(select == 'q') {
				System.out.println("q.프로그램 종료중...");
				break;
			}else {
				System.out.println("해당 명령은 선택할 수 없습니다.");
			}
		}
		System.out.println("프로그램 종료되었습니다.");
	}	
}