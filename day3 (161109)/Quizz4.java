import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// 임의의 두자리 숫자를 입력받아서
		// 그 숫자에 해당하는 한글로 변환하기
		// 예) 23 -> 이십삼
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int num = sc.nextInt();
		
		int num1 = num / 10;
		int num2 = num - (num1*10);

		if (num1 == 1) {
			System.out.print("");
		} else if (num1 == 2) {
			System.out.print("이");
		} else if (num1 == 3) {
			System.out.print("삼");
		} else if (num1 == 4) {
			System.out.print("사");
		} else if (num1 == 5) {
			System.out.print("오");
		} else if (num1 == 6) {
			System.out.print("육");
		} else if (num1 == 7) {
			System.out.print("칠");
		} else if (num1 == 8) {
			System.out.print("팔");
		} else if (num1 == 9) {
			System.out.print("구");
		}

		System.out.print("십");

		if (num2 == 1) {
			System.out.println("일");
		} else if (num2 == 2) {
			System.out.println("이");
		} else if (num2 == 3) {
			System.out.println("삼");
		} else if (num2 == 4) {
			System.out.println("사");
		} else if (num2 == 5) {
			System.out.println("오");
		} else if (num2 == 6) {
			System.out.println("육");
		} else if (num2 == 7) {
			System.out.println("칠");
		} else if (num2 == 8) {
			System.out.println("팔");
		} else if (num2 == 9) {
			System.out.println("구");
		}
	}
}