import java.util.Scanner;

public class IfDemo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���Ⱓ�� �Է��ϼ���(��): ");
		int year = sc.nextInt();
		System.out.print("����Ÿ��� �Է��ϼ���(km): ");
		int distance = sc.nextInt();
		
		// ���Ⱓ�� 5�� �̻��̰ų�
		// ����Ÿ��� 100000km �̻��̸�
		// �����������̰�, �� ���� ���� �����������̴�.

		if (year >= 5 || distance >= 100000) {
			System.out.println("����������");
		} else {
			System.out.println("����������");
		}
	}
}