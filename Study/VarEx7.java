package Study;

import java.util.Scanner;

public class VarEx7 {

	public static void main(String[] args) {
		/**
		 * int score 입력
		 * score 마이너스 점수이거나 100점을 넘으면 X출력
		 * 90이상 A
		 * 80이상 B
		 * 70이상 C
		 * 60이상 D
		 * 그외   F
		 * 성적을 입력해 주세요: 85
		 * 학생의 평점은 B등급입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = null;
		
		System.out.println("성적입력: ");
		score = scanner.nextInt();
		
		grade = score < -1 && score > 101 ?
				score > 90 ? "A" :
					score > 80 ? "B" :
						score > 70 ? "C" : "D" : "오류";
		
		System.out.print("학생의 평점은 " + grade + "등급입니다.");
		
		
	}

}





















