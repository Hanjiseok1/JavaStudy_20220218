package ex_0;

import java.util.Scanner;

public class ex_25 {

	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		System.out.print("반복 횟수 입력: ");
		n = scanner.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
//			for(int j = 0; j < n - i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		}
	}
		
}