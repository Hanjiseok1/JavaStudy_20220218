package ex_0;

public class ex_17 {

	public static void main(String[] args) { 	
		/*
		 * 논리연산자
		 * true(1), false(0)
		 * 
		 * AND(곱) && -> 모든 값이 true여야 true의 결과가 나옴
		 * -> true && true -> true
		 * -> true && false -> false
		 * 
		 * OR(합) || -> 둘 중 하나라도 true이면 true이고, 둘다 false경우 false
		 * -> true || true -> true
		 * -> true || false -> true
		 * -> false || false -> false
		 * 
		 * NOT(부정) !
		 * !true -> false
		 * !false -> true
		 */
		
		int score = 0;
		boolean result = score >= 80 && score < 90;
		System.out.println(result);
		System.out.println(score == 0);
		System.out.println(score != 0);
	}
}
