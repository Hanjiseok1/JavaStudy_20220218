package ex_0;

public class ex_26 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 2001; i++) {
			int year = i + 1;
			if(!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
				continue;
			}
			System.out.println(year);
		}
	}	
}
