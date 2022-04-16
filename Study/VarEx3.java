package Study;

public class VarEx3 {

	public static void main(String[] args) {
		
		// 논리형 (boolean) - true, false
		// 정수형 (byte, short, int, long)
		//		   byte, short 타입은 리터럴이 없고,
		//		   값을 저장할땐 int 타입의 리터럴 사용
		// 실수형 (double, float)
		// 문자형 (char)
		// 문자열 (String)
//		
//		boolean power = true; // 불리언 타입은 참과 거짓만 저장가능함
//		char ch = 'A'; // 캐릭터 타입의 변수에는 하나의 문자만 저장가능
//		String str = "ABC"; // 여러문자를 저장하려면 String타입의 변수를 사용해야함
//		byte b = 127; // int 타입의 변수이지만 byte 타입의 저장할수있는 공간을 활용가능
//		long i = 10_000_000_000l; // 저장할수있는 공간이 부족함으로 접미사 L 붙힐것.
//		long i = 100;	// 충분한 공간이 있으므로 생략 가능함.
//		float f - 3.14f;	// double타입의 변수를 저장할수없어서 에러가뜸 접미사 F를 붙혀야함
//		double d = 3.14;	// 생략이 가능함.
	
		// 변수와 리터럴의 타입 불일치
		// 1. 범위가 "변수 > 리터럴" 인 경우, 사용 가능 
		//	int i = 'A';  int > char
		//	long l = 123; long > int
		//	double d = 3.14f double > float
		// 2. 범위가 "변수 < 리터럴" 인 경우, 에러
		//	int i = 3000000000; int의 범위를 벗어남
		//	long l = 3.14f 		long < float
		// 	float f = 3.14d		float < double
		// 3. byte, short 변수에 int 리터럴 저장가능
		
		
		boolean power = true;
		
		byte b = 127; // -128 ~ 127
		
		int oct = 010; 		// 8진수, 10진수로 8
		int hex = 0x10; 	// 16진수, 10진수로 16
		
		long i = 10_000_000_000L;
		
		float f = 3.14f;
		double d = 3.14;
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		
	
	}

}





















