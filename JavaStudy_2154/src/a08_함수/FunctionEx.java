package a08_함수;

public class FunctionEx {
	
	public static int calc(int x, int y, int z) {
		int result = x + y;
		int result2 = result * z;
		return result2;
	}

	public static void main(String[] args) {
		
		System.out.println(calc(10, 20, 30));
		System.out.println(calc(11, 20, 30));
		System.out.println(calc(12, 20, 30));
		System.out.println(calc(13, 20, 30));
		System.out.println(calc(14, 20, 30));
		System.out.println(calc(15, 20, 30));
			
	}

}
