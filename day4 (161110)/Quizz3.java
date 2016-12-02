import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;

		for (;;) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			int selectedNo = sc.nextInt();

			if (selectedNo == 1) {
				System.out.print("예금액> ");
				int in = sc.nextInt();
				balance = balance + in;
				System.out.println("잔액> " + balance + "원");
			} else if (selectedNo == 2) {
				System.out.print("출금액> ");
				int out = sc.nextInt();

				if (balance < out) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance = balance - out;
					System.out.println("잔액> " + balance + "원");
				}

			} else if (selectedNo == 3) {
				System.out.println("잔액> " + balance + "원");
			} else if (selectedNo == 4) {
				System.out.println("종료합니다.");
				break;
			}

		}

	}
}