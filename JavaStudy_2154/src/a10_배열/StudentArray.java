package a10_배열;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[5];
		students[0] = new Student("김준일", 1);
		students[1] = new Student("김준이", 4);
		students[2] = new Student("김준삼", 3);
		students[3] = new Student("김준사", 1);
		students[4] = new Student("김준오", 2);

		int[] yearCounts = new int[4];

		/*
		 * 1학년: 2명
		 * 2학년: 1명
		 * 3학년: 1명
		 * 4학년: 1명
		 */
		
		for(int i = 0; i < students.length; i++) {		
			int studentYear = students[i].getStudentYear();
			if(studentYear == 1) {
				yearCounts[0]++;				
			}else if(studentYear == 2) {
				yearCounts[1]++;				
			}else if(studentYear == 3) {
				yearCounts[2]++;				
			}else if(studentYear == 4) {
				yearCounts[3]++;
			}
		}
		
		System.out.println("1학년: " + yearCounts[0] + "명");
		System.out.println("2학년: " + yearCounts[1] + "명");
		System.out.println("3학년: " + yearCounts[2] + "명");
		System.out.println("4학년: " + yearCounts[3] + "명");
	}

}
