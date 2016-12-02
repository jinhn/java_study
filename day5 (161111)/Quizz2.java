import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 숫자를 입력받아서 그 숫자들의 합과 평균을 계산해서 출력하기
		// 1. 학생 수를 입력받기
		// 2. 학생 수 만큼의 크기를 가진 배열을 만들기
		// 3. 학생 수 만큼 반복하면서 점수를 입력받고 배열에 담기
		// 4. 배열에 저장된 값으로 합계와 평균을 계산해서 출력하기

		System.out.print("국어 시험을 본 학생들의 수를 입력하세요: ");
		int size = sc.nextInt();

		int[] scores = new int[size];
		System.out.println("학생수: " + size);

		// 배열에 국어점수 저장
		for (int a=0; a<scores.length; a++) {
			System.out.print("점수를 입력해주세요: ");
			int score = sc.nextInt();
			scores[a] = score;
		}

		// 총점과 평균 계산
		int sum = 0;
		int avg = 0;
		//for (int b=0; b<scores.length; b++) {
		//	sum += scores[b];
		//}
		for (int score : scores) {
			sum += score;
		}
		avg = sum / scores.length;
		//System.out.println("합계: " + sum + " 평균: " + avg);
		System.out.printf("합계: %d 평균: %d\n", sum, avg);
	}
}