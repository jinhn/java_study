public class ArrayDemo2 {
	public static void main(String[] args) {
		// �迭 �����ϱ�
		// int[] arr1 = {1, 2, 4, 5, 6};	<-- ���� ������ �ִ� �迭
		// int[] arr2 = new int[3];			<-- �� 3���� ���� �� �ִ� �迭
		//									<-- ������ �迭�� �⺻�� 0���� ä�����ִ�.
		// �������� 0, �Ǽ����� 0.0, �������� \u0000, �Ҹ����� false, �������� null
		int[] numbers = new int[3];
		System.out.println(numbers[0]);	// 0 ���
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		//System.out.println(numbers);	[I@15db9742 <- �ؽ��ڵ尪

		String[] names = new String[3];
		System.out.println(names[0]);	// null ���
		System.out.println(names[1]);
		System.out.println(names[2]);
		//System.out.println(names);	[Ljava.lang.String;@6d06d69c
	}
}