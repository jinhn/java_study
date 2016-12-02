public class ArrayService {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// �迭 �̵���Ű��
	// arr1�迭���� no�� ã�Ƽ� ��ĭ�� ��������, no�� �� �ڷ�
	public int[] move(int no) {
		int temp = arr1[no-1];
		for (int i=no-1; i<9; i++) {
			arr1[i] = arr1[i+1];
		}
		arr1[9] = temp;
		return arr1;
	}

	// �迭 �����ϱ�
	// arr2�迭���� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	// begin 3 �̸� 3���� ������ ���ο� �迭 ��ȯ
	public int[] copy(int begin) {
		int position = 0;
		int[] temp = new int[11-begin];
		for (int i=begin-1; i<10; i++) {
			temp[position] = arr2[i];
			position++;
		}
		return temp;
	}

	// �迭 �߶󳻱�
	// arr3�迭�� ������ ��ġ���� ������ ��ġ���� �����ѹ迭�� ��ȯ�ϱ�
	public int[] copy(int begin, int end) {
		int position = 0;
		int[] result = new int[end-begin+1];
		for (int i=begin-1; i<end; i++) {
			result[position] = arr3[i];
			position++;
		}
		return result;
	}

	// ���ϸ�
	// arr4 (5, 2)�̸� 5�� 2ĭ �������� �̵�
	public int[] shift(int begin, int step) {
		int temp = arr4[begin-1];
		for (int i=begin-1; i>=begin-step; i--) {
			arr4[i] = arr4[i-1];
		}
		arr4[begin-step-1] = temp;
		return arr4;

	}
}