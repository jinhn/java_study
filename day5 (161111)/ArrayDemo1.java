public class ArrayDemo1 {
	public static void main(String[] args) {
		// ���� 5���� ������ �ִ� �迭 �����
		int[] numbers = {1, 5, 8, 10, 4};
		
		// �迭�� ũ�⸦ �˾Ƴ���
		// numbers.length
		int size = numbers.length;
		System.out.println("�迭�� ũ��: " + size);

		// �迭���� �� ��������
		// numbres[�ε�����ȣ]
		int x = numbers[0];
		int y = numbers[1];
		System.out.println("�迭�� 0��° ��: " + x);
		System.out.println("�迭�� 1��° ��: " + y);
		
		// ��� ������ �հ踦 ���ϱ�
		
		//int sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
		//System.out.println("�հ�: " + sum);
		
		//int sum = 0;
		//sum += numbers[0];
		//sum += numbers[1];
		//sum += numbers[2];
		//sum += numbers[3];
		//sum += numbers[4];
		//System.out.println("�հ�: " + sum);
		
		//int sum = 0;
		//for (int i=0; i<=4; i++) {
		//	sum += numbers[i];
		//}
		//System.out.println("�հ�: " + sum);

		//int sum = 0;
		//for (int i=0; i<size; i++) {
		//	sum += numbers[i];
		//}
		//System.out.println("�հ�: " + sum);

		// enhanced for��
		int sum = 0;
		for (int i:numbers) {
			sum += i;
		}
		System.out.println("�հ�: " + sum);
	}
}