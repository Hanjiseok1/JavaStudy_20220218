package a15_lombok;

import java.time.LocalDate;
import java.util.Date;

public class IphoneTest {

	public static void main(String[] args) {

		Iphone iphone12Mini = new Iphone(12, "mini", "white", 128, LocalDate.parse("2021-01-01").getYear());
		Iphone iphone12Mini2 = new Iphone(12, "mini", "white", 256, LocalDate.parse("2021-01-01").getYear());
		Iphone iphone13Mini = new Iphone(13, "Max", "black", 256, LocalDate.parse("2021-01-01").getYear());
		Iphone iphone12Max = new Iphone(12, "mini", "red", 128, LocalDate.parse("2021-01-01").getYear());
		Iphone iphone13Max = new Iphone(13, "Max", "blue", 512, LocalDate.parse("2021-01-01").getYear());

		iphone13Mini.setColor("gray");
		
		System.out.println("두 아이폰 비교 : " + (iphone12Mini.equals(iphone12Mini2)));
		
		System.out.println(iphone12Mini);
		System.out.println(iphone13Mini);
		System.out.println(iphone12Max);
		System.out.println(iphone13Max);
	}

}
