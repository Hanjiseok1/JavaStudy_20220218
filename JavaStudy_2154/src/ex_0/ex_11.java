package ex_0;

public class ex_11 {

	public static void main(String[] args) {
		//형변환(업캐스팅, 다운캐스팅)
		// 문자(2) -> 정수(4) -> 실수(8)
		char a = 1;
		int b = 2;
		a = (char)b; // 명시적 형변환 (다운캐스팅)
		b = a; // (생략)묵시적 형변환 (업캐스팅)
	}
}
