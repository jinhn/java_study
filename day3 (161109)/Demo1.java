public class Demo1 {
	public static void main(String[] args) {
		// �� ������
		int x = 10;
		int y = 10;
		
		// &&�� �º��� false�̸�
		// �캯�� ������ �ʰ�
		// �ٷ� ��ü ����� false�� ����
		boolean result1 = false && x++ > 10;
		boolean result2 = false & y++ > 10;
		System.out.println(result1); // false
		System.out.println(result2); // false
		System.out.println("x: " + x); // 10
		System.out.println("y: " + y); // 11
	}
}