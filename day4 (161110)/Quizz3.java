import java.util.Scanner;

public class Quizz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int balance = 0;

		for (;;) {
			System.out.println("---------------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("---------------------------------");
			System.out.print("����> ");
			int selectedNo = sc.nextInt();

			if (selectedNo == 1) {
				System.out.print("���ݾ�> ");
				int in = sc.nextInt();
				balance = balance + in;
				System.out.println("�ܾ�> " + balance + "��");
			} else if (selectedNo == 2) {
				System.out.print("��ݾ�> ");
				int out = sc.nextInt();

				if (balance < out) {
					System.out.println("�ܾ��� �����մϴ�.");
				} else {
					balance = balance - out;
					System.out.println("�ܾ�> " + balance + "��");
				}

			} else if (selectedNo == 3) {
				System.out.println("�ܾ�> " + balance + "��");
			} else if (selectedNo == 4) {
				System.out.println("�����մϴ�.");
				break;
			}

		}

	}
}