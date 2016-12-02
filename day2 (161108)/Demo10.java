public class Demo10 {
	public static void main(String[] args) {
		// 산술 연산자
		int a = 10;
		int b = 5;

		int c = a + b;
		int d = a - b;
		int e = a*b;
		int f = a/b;
		int g = a%b;
		System.out.println(g);

		String x = "가나다라";
		String y = "hello";
		String z = x + y;
		System.out.println(z);

		System.out.println(3 + 6 + "hello");
		// 결과 : 9hello
		System.out.println("hello" + 3 + 6);
		// 결과 : hello36

		int kor = 60;
		int eng = 70;
		int math = 30;

		System.out.println("총점: " + (kor + eng + math));
	}
}