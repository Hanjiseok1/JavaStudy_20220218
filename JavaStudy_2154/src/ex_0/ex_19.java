package ex_0;

public class ex_19 {

	public static void main(String[] args) {
		int num = 0;
		int result = 0;
		
		while(num < 100) {
			result += (++num);
		}
		System.out.println(result);
		
		int i = 0;
		while(i < 100) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("-----------------");
		
		for(int j = 0; j < 100; j++) {
			System.out.println(j);
		}
	}
}
