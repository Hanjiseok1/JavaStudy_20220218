package ex_0;

public class ex_12 {

	public static void main(String[] args) { //스코어
		
		double kor = 80.5;
		double eng = 90.0;
		double math = 75.8;
		
		double avg = 0; //평균
		double total = 0; //합계
		
		int iAvg = 0; //각각의 점수에서 소숫점을 뺸 평균
		int iTotal = 0; //각각의 점수에서 소숫점을 뺀 합계
		
		total = kor + eng + math;					// 위에서 아래로 읽기 때문에 total 먼저 적었음.
		avg = total / 3;
		iTotal = (int)kor + (int)eng + (int)math;
		iAvg = iTotal / 3;
				
		System.out.println("평균1: " + avg);
		System.out.println("합계1: " + total);
		System.out.println("평균2: " + iAvg);
		System.out.println("합계3: " + iTotal);

	}

}
