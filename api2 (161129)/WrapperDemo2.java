public class WrapperDemo2 {
	public static void main(String[] args) {
	
		// Integer의 정적 메소드

		// 문자열을 int값으로 변환하는 메소드: int parseInt(String text)
		int num1 = Integer.parseInt("123");

		int num2 = Integer.parseInt("11", 2); // 2진수를 10진수로 변환
		System.out.println("num2: " + num2); // 3

		int num3 = Integer.parseInt("ab1", 16); // 16진수를 10진수로 변환
		System.out.println("num3: " + num3); // 2737

		String str1 = Integer.toBinaryString(12); // 10진수를 2진수로 변환
		System.out.println("str1: " + str1); // 1100

		String str2 = Integer.toHexString(15345); // 10진수를 16진수로 변환
		System.out.println("str2: " + str2); // 3bf1

		double num4 = Double.parseDouble("3.14"); // 문자열을 double값으로 변환
		System.out.println(num4 * 2); // 6.28
	}
}