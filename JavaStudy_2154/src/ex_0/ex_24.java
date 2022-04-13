package ex_0;

import java.util.Scanner;

public class ex_24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int startIndex = 0;
		int endIndex = 0;
		
		System.out.print("시작 단: ");
		startIndex = scanner.nextInt();
		System.out.print("마지막 단: ");
		endIndex = scanner.nextInt();
		System.out.println();
		
		for(int i = startIndex; i < (endIndex + 1); i++) {
			System.out.println(i + "단");
			
			for(int j = 0; j < 9;) {
				System.out.println(i + " X " + (++j) + " = " + (i * j));
			}
			System.out.println();
		}
		
		int i = startIndex;
		
		while(i < endIndex + 1) {
			int dan = i + 2;
			System.out.println(i + "단");
			
			int j = 0;
			while(j < 9) {
				System.out.println(i + " X " + (++j) + " = " + (i * j));
			}
			System.out.println();
			i++;
		}
				
	}
		
}
