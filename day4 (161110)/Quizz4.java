import java.util.Scanner;
import java.util.Random;

public class Quizz4 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Random random = new Random();
	// ���ε��� : �� �ֻ����� ���� 7�̸� ���ε���
	// ���ε� Ż�� : ���� ���� �����϶� Ż��
	// ���ε� Ż�� : �ֻ����� 3�� ������ Ż��
	// ĭ�̵� : ���ε��� ������ ���� ��� �ֻ��� �ո�ŭ �̵�
	int island = 0; // 0�̸� ���� 1�̸� ���ε�
	int count = 3; // 3���� ��ȸ
	int condition = 0; // �������
	int conditionMax = 0; // �����̵��Ÿ�
	int distance = 50; // �����̵��Ÿ�

		for (;;) {
			System.out.println("----------------------------");
			System.out.println("1. �ֻ��� ������     0. ����");
			System.out.println("----------------------------");

			System.out.print("�����ϼ���: ");
			int no = sc.nextInt();

			if (no == 1) {
				int first = random.nextInt(6) + 1;
				int second = random.nextInt(6) + 1;
			//	System.out.printf("(%d, %d)\n", first, second);
				if (island == 0) { // ���ε��ƴҶ�
					if (first + second == 7) {
						count = 3;
						island = 1;
						System.out.println("���ε��Դϴ�");

					} else if (first + second != 7)	{
						condition = first + second;
						conditionMax = conditionMax + condition;
						distance = distance - condition;
						System.out.printf("%dĭ �̵��ϼ��� \n", condition);
						System.out.printf("%dĭ �̵��߽��ϴ� \n", conditionMax);
						System.out.printf("%dĭ ���ҽ��ϴ� \n", distance);
						if (distance <= 0) {
							System.out.println("��. �����ϼ̽��ϴ�");
							break;
						}
					}

				} else if (island == 1) { // ���ε��϶�
					if (first == second) {
						island = island -1;
						System.out.println("Ż�⼺���Դϴ�");
					
					} else if (first != second)	{
						if (count == 1) {
							island = island - 1;
							count = 3;
							System.out.println("Ż�⼺���Դϴ�");
						} else if (count != 1) {
							count = count -1;
							System.out.println("�ٽ� ��������");
						}
					}
				}

			} else if (no == 0) {
				System.out.println("�����մϴ�.");
				break;
			}
		}	
	}
}