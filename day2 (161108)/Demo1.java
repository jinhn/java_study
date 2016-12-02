public class Demo1 {
	public static void main (String[] args) {
		// 정수 타입
		byte b1 = 23;
		byte b2 = -126;
		// byte b3 = 128; byte 자료형의 범위를 벗어난 값

		int a1 = 128;
		int a2 = -128;

		long c1 = 10000;
		// 숫자의 범위가 int의 범위를 벗어나는 값일 경우
		// 반드시 숫자 끝에 L을 표시해야 한다.
		long c2 = 100000000000L;

		int m1 = 10;  // 십진수로 10 표현
		int m2 = 012; // 8진수로 10 표현
		int m3 = 0xA; // 16진수로 10 표현

		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);

		// Java7부터 자릿수를 표현하기위해서 _사용가능
		int m4 = 100_000_000;
		int m5 = 5;
		System.out.println(m4 * m5);
	}
}