import java.util.Scanner;

public class Quizz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ���ڸ� �Է¹޾Ƽ� �� ���ڵ��� �հ� ����� ����ؼ� ����ϱ�
		// 1. �л� ���� �Է¹ޱ�
		// 2. �л� �� ��ŭ�� ũ�⸦ ���� �迭�� �����
		// 3. �л� �� ��ŭ �ݺ��ϸ鼭 ������ �Է¹ް� �迭�� ���
		// 4. �迭�� ����� ������ �հ�� ����� ����ؼ� ����ϱ�

		System.out.print("���� ������ �� �л����� ���� �Է��ϼ���: ");
		int size = sc.nextInt();

		int[] scores = new int[size];
		System.out.println("�л���: " + size);

		// �迭�� �������� ����
		for (int a=0; a<scores.length; a++) {
			System.out.print("������ �Է����ּ���: ");
			int score = sc.nextInt();
			scores[a] = score;
		}

		// ������ ��� ���
		int sum = 0;
		int avg = 0;
		//for (int b=0; b<scores.length; b++) {
		//	sum += scores[b];
		//}
		for (int score : scores) {
			sum += score;
		}
		avg = sum / scores.length;
		//System.out.println("�հ�: " + sum + " ���: " + avg);
		System.out.printf("�հ�: %d ���: %d\n", sum, avg);
	}
}