import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3자리의 정수를 입력받아서
		// 100의 자리
		// 10의 자리
		// 1의 자리숫자를 각각 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int number = sc.nextInt();

		int num1 = number/100;
		int num2 = (number - (num1*100))/10;
		int num3 = number - (num1*100) - (num2*10);
		System.out.println("100의 자리: " + num1);
		System.out.println("10의 자리: " + num2);
		System.out.println("1의 자리: " + num3);
	}
}