public class ForDemo6 {
	public static void main(String[] args) {
		// 1 ~ 100������ ���� ����ϱ�
		// ��, �հ谡 3000�� �Ѿ�� ������ ���ڸ� �˾Ƴ���
		int sum = 0;
		int number = 0;

		for (int a=1; a<=100; a++) {
			sum += a;
			if (sum > 3000)	{
				number = a;
				break;
			}
		}
		System.out.println(number);
	}
}