import java.util.Scanner;
import java.util.Random;

public class Quizz4as {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	// ���ε��� : �� �ֻ����� ���� 7�̸� ���ε���
	// ���ε� Ż�� : ���� ���� �����϶� Ż��
	// ���ε� Ż�� : �ֻ����� 3�� ������ Ż��
	// ĭ�̵� : ���ε��� ������ ���� ��� �ֻ��� �ո�ŭ �̵�
	boolean island = false;	// false�̸� ���� true�̸� ���ε�
	int count = 3;			// 3���� ��ȸ
	int distance = 0;		// �̵��Ÿ�

		for (;;) {
			System.out.println("----------------------------");
			System.out.println("1. �ֻ��� ������     0. ����");
			System.out.println("----------------------------");

			System.out.print("�����ϼ���: ");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6) + 1;		// �ֻ��� 1
				int second = random.nextInt(6) + 1;		// �ֻ��� 2
				System.out.printf("(%d, %d)\n", first, second);
				if (!island) {				// ���ε��ƴҶ�
					if (first + second == 7) {
						island = true;		// ���ε���
						count = 3;			// Ż����� 3ȸ ����
						System.out.println("���ε��Դϴ�");

					} else {						// �ֻ��� ���� 7�� �ƴ� ���
						distance += first + second; // �̵��Ÿ� ����
						System.out.println("�̵��Ÿ�: " + distance+ "ĭ");
						if (distance > 100) {		// �̵��Ÿ� 100������ ��
							System.out.println("��. �����ϼ̽��ϴ�");
							break;
						}
					}

				} else {					// ���ε��϶�
					if (first == second) {
						island = false;		// ���ε� Ż��
						System.out.println("����~! Ż�⼺���Դϴ�");
					
					} else {					// �ֻ����� �ٸ� ���
						count--;				// ���� Ƚ�� 1����
						if (count == 0) {		// ���� Ƚ���� 0�̸�
							island = false;		// ���ε� Ż��
							System.out.println("3�� �޽�~! Ż�⼺���Դϴ�");
						} else {
							System.out.println("Ż����� ["+count+"]�� ���ҽ��ϴ�");
						}
					}
				}

			} else {
				System.out.println("�����մϴ�.");
				break;
			}
		}	
	}
}