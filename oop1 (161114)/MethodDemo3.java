import java.util.Random;

public class MethodDemo3 {
	// ������ �߻���Ű�� �޼ҵ� �����
	public static int random() {
		Random r = new Random();
		int number = r.nextInt(100);

		// return Ű����� �� �޼ҵ带 ȣ���� ���� ���� ��ȯ�Ѵ�.
		// number�� ����ִ� ���� ���Եȴ�.
		return number;
	}

	public static void a() {
	
	}

	public static void main(String[]args) {
		int x = random();
		System.out.println(x);

		System.out.println(random() * 100);
	}
}