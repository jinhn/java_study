public class Demo10 {
	public static void main(String[] args) {
		// ��� ������
		int a = 10;
		int b = 5;

		int c = a + b;
		int d = a - b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);

		String x = "�����ٶ�";
		String y = "hello";
		String z = x + y;
		System.out.println(z);

		System.out.println(3 + 6 + "hello");
		// ��� : 9hello
		System.out.println("hello" + 3 + 6);
		// ��� : hello36

		int kor = 60;
		int eng = 70;
		int math = 30;

		System.out.println("����: " + (kor + eng + math));
	}
}