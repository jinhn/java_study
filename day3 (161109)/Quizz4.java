import java.util.Scanner;

public class Quizz4 {
	public static void main(String[] args) {
		// ������ ���ڸ� ���ڸ� �Է¹޾Ƽ�
		// �� ���ڿ� �ش��ϴ� �ѱ۷� ��ȯ�ϱ�
		// ��) 23 -> �̽ʻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int num = sc.nextInt();
		
		int num1 = num / 10;
		int num2 = num - (num1*10);

		if (num1 == 1) {
			System.out.print("");
		} else if (num1 == 2) {
			System.out.print("��");
		} else if (num1 == 3) {
			System.out.print("��");
		} else if (num1 == 4) {
			System.out.print("��");
		} else if (num1 == 5) {
			System.out.print("��");
		} else if (num1 == 6) {
			System.out.print("��");
		} else if (num1 == 7) {
			System.out.print("ĥ");
		} else if (num1 == 8) {
			System.out.print("��");
		} else if (num1 == 9) {
			System.out.print("��");
		}

		System.out.print("��");

		if (num2 == 1) {
			System.out.println("��");
		} else if (num2 == 2) {
			System.out.println("��");
		} else if (num2 == 3) {
			System.out.println("��");
		} else if (num2 == 4) {
			System.out.println("��");
		} else if (num2 == 5) {
			System.out.println("��");
		} else if (num2 == 6) {
			System.out.println("��");
		} else if (num2 == 7) {
			System.out.println("ĥ");
		} else if (num2 == 8) {
			System.out.println("��");
		} else if (num2 == 9) {
			System.out.println("��");
		}
	}
}