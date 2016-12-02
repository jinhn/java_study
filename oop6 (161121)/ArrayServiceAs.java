public class ArrayServiceAs {
	int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	// �迭 �̵���Ű��
	// arr1�迭���� no�� ã�Ƽ� ��ĭ�� ��������, no�� �� �ڷ�
	public int[] move(int no) {
		// ������ ���纻�� ����
		int[] result = new int[arr1.length];
		for (int i=0; i<arr1.length; i++) {
			result[i] = arr1[i];
		}
		// ���� ó�� ���������� ���� �̸� ����
		int number = arr1[no-1];
		// �迭�� ���� �� ĭ�� ������ �̵�
		for (int i=no; i<arr1.length; i++) {
			result[i-1] = arr1[i];
		}
		// �� ������ ĭ�� �Ʊ� �����صξ��� ���� ����
		result[result.length-1] = number;
		
		return result;
	}

	// �迭 �����ϱ�
	// arr2�迭���� ������ ��ġ���� ������ ������ �迭�� ��ȯ�ϱ�
	// begin 3 �̸� 3���� ������ ���ο� �迭 ��ȯ
	public int[] copy(int begin) {
	
		int[] result = new int[arr2.length - begin];
		
		for (int i=begin; i<arr2.length; i++) {
			result[i-begin] = arr2[i];
		}

		return result;
	}

	// �迭 �߶󳻱�
	// arr3�迭�� ������ ��ġ���� ������ ��ġ���� �����ѹ迭�� ��ȯ�ϱ�
	public int[] cut(int begin, int end) {
	
		int[] result = new int[end-begin+1];

		for (int i=begin; i<=end; i++) {
			result[i-begin] = arr3[i];
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