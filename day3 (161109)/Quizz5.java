import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// 국어, 영어, 수학점수를 입력받아서
		// 총점, 평균, 학점을 출력하기
		// 학점은 90이상:A, 80이상:B, 70이상:C, 60이상:D, 그 외는 F
		Scanner sc = new Scanner(System.in);
		System.out.print("국어: ");
		int kor = sc.nextInt();
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total / 3;
		String grade = "";
				
		if (total >= 90) {
			grade = "A";
		} else if (total >= 80) {
			grade = "B";
		} else if (total >= 70)	{
			grade = "C";
		} else if (total >= 60)	{
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("총점 " + total + " 평균 " + avg + " 학점 " + grade);
	}
}