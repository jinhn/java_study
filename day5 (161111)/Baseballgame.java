import java.util.*;

public class Baseballgame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		// ���ڵ� ���� �ڸ��� ������ strike
		// ���ڴ� ������ �ڸ��� �ٸ��� ball
		// �ƹ� ���ڵ� ���� ������ out
		// Tip! 2�� for�� ���, numbers outfor�� answer innerfor��
		//      ���ڰ� ������ �ڸ������� ������ ��

		// ������ ���� 3���� ������ �迭
		int[] numbers = new int[3];
		int position = 0;
		for (;;) {
			int number = ran.nextInt(10);
			boolean isExist = false;
			for (int i=0; i<position; i++) {
				if (numbers[i] == number) {
					isExist = true;
				}
			}
			if (!isExist) {
				numbers[position] = number;
				position++;
			}
			if (position == 3) {
				break;
			}
		}
		System.out.println(Arrays.toString(numbers));

		// ����ڰ� �Է��� ���� ������ �迭
		int[] answer = new int[3];

		boolean isSuccess = false;

		for (int a=1; a<=10; a++) { // ����Ƚ��
			int strike = 0;
			int ball = 0;
			// ���⸦ �����Ұ�

			if (strike == 3) {
				isSuccess = true;
				break;
			}
			
		}

		if (isSuccess) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
	}
}