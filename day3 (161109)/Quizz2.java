import java.util.*;

public class Quizz2 {
	public static void main(String[] args) {
		// 3�ڸ��� ������ �Է¹޾Ƽ�
		// 100�� �ڸ�
		// 10�� �ڸ�
		// 1�� �ڸ����ڸ� ���� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int number = sc.nextInt();

		int num1 = number/100;
		int num2 = (number - (num1*100))/10;
		int num3 = number - (num1*100) - (num2*10);
		System.out.println("100�� �ڸ�: " + num1);
		System.out.println("10�� �ڸ�: " + num2);
		System.out.println("1�� �ڸ�: " + num3);
	}
}