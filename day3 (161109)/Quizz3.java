import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		// 임의의 숫자를 입력받아서
		// 그 수가 짝수인지 홀수인지
		// 삼항연산자를 이용해서
		// 결과를 표시하기
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		String result = (num%2) == 0 ? "짝수" : "홀수";
		System.out.println(result);
	}
}