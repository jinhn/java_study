import java.util.Scanner;

public class IfDemo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1:Ŀ��(1500��) 2:�����ֽ�(2000��) 3:�̿�����(1000��)");
		
		System.out.print("���� ��������: ");
		int money = sc.nextInt();
		System.out.print("���Ḧ ������: ");
		int no = sc.nextInt();

		int returnCoin = 0;

		if ( no == 1 ) {
			System.out.println("Ŀ�Ǹ� ����������");
			returnCoin = money - 1500;
		}
		if ( no == 2 ) {
			System.out.println("�����ֽ��� ����������");
			returnCoin = money - 2000;
		}
		if ( no == 3 ) {
			System.out.println("�̿����Ḧ ����������");
			returnCoin = money - 1000;
		}
		System.out.println("�Ž������� " + returnCoin + "�� �Դϴ�.");
	}
}