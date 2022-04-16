package Study;

public class VarEx6 {

	public static void main(String[] args) {
		
		// 문자열
		// == 연산자를 이용할 경우, 참조 타입의 변수의 값은 힙 영역의 객체 주소이므로 값이 다르게 나옴
		// 문자열을 서로 비교할땐 equals 메소드를 이용할 것
		
		// String s1 = "abcd";
		// String s2 = new String("abcd");
		//		
		// if(s1.equals(s2)) {
		//		System.out.println("값이 같습니다.");
		//	}else {
		//		System.out.println("값이 다릅니다.");
		//	}
		//		
			
		/*
		 * 문자열 형변환
		 * 문자열(String) -> Integer(int)
		 * Integer.parseInt("100"); -> 숫자 100으로 변환
		 * Double.parseDouble("15.123"); -> 실수 15.123으로 변환
		 * Boolean.parseBoolean("true");
		 * 
		 * 정수, 실수 등을 문자열로 형변환
		 * Integer.toString(100); -> 문자열 100으로 변환
		 * Double.toString(3.41); -> 문자열 3.41로 변환
		 * Boolean.toString(true); -> 문자열 true로 변환
		 * 
		 */
		
//		int num = Integer.parseInt("100");
//		double dNum = Double.parseDouble("3.14");
//		
//		System.out.println(num + 20);
//		System.out.println(dNum + 30);
//		System.out.println(!Boolean.parseBoolean("true"));
//		System.out.println("" + 100);
//		
//		String num2 = Integer.toString(100);
//		System.out.println(num + 100);
//		
		/**
		 * 2022년 02월 22일 코리아아이티아카데미부산 학생정보
		 * year	  month day academy(문자열)
		 */
		
		int i_year = 2022;
		String name = "한지석";
		String year = "" + (i_year);
		String month = "02";
		String day = "22";
		String academy = "코리아아이티아카데미";
		
		System.out.println(year+ "년" + month + "월" + day + "일" + academy);
		System.out.println("학생정보: " + name);
		
		//문자열 형변환
		
		int num = Integer.parseInt("100");
		double dNum = Double.parseDouble("3.14");
		System.out.println(!Boolean.parseBoolean("true"));
		
		String num2 = Integer.toString(100);
		// 문자열을 더블로 형변환
		String num3 = Double.toString(3.14);
		System.out.println(Double.parseDouble(num3) + 10);
		
		System.out.println("" + 7 + 7);
		System.out.println(7+7+""+7+7);
		
				
	}

}





















