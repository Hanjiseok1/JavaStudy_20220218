package ex_0;

import java.util.Scanner;

public class ex_33 {
	
	public static String calc(String num1, String num2, char opretor) {
		String result = null;
		
		if(opretor == '+') {
			result = Double.toString(Double.parseDouble(num1) + Double.parseDouble(num2));
		}else if(opretor == '-') {
			result = Double.toString(Double.parseDouble(num1) - Double.parseDouble(num2));
		}else if(opretor == '*') {
			result = Double.toString(Double.parseDouble(num1) * Double.parseDouble(num2));
		}else if(opretor == '/') {
			result = Double.toString(Double.parseDouble(num1) / Double.parseDouble(num2));
		}else {
			result = "계산 할 수 없는 연산자 입니다.";
		}
		return result;
	}
	
	public static void main(String[] args) {	
		Scanner scanner = new Scanner(System.in);
		String num1 = null, num2 = null;	
		char operator = ' ';
		
		System.out.println("첫번째 수 입력: ");
		num1 = scanner.next();
		System.out.println("연산할 기호를 선택하세요: ");
		operator = scanner.next().charAt(0);
		System.out.println("두번째 수 입력: ");
		num2 = scanner.next();
	}
	
}
