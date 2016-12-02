public class Calculator {
	// 메소드 오버로딩
	// 유사한 작업은 동일한 이름으로 해야한다.
	// 같은 이름의 메소드이름은 가능,
	// 타입이 다르거나 갯수가 달라야함

	// 정수 2개를 전달받아서 합을 계산하고 반환하는 메소드
	public int plus(int a, int b) {
		System.out.println("정수 + 정수");

		return a + b;
	}
	// 실수 2개를 전달받아서 합을 계산하고 반환하는 메소드
	public double plus(double a, double b) {
		System.out.println("실수 + 실수");

		return a + b;
	}
	// 정수 3개를 전달받아서 합을 계산하고 반환하는 메소드
	public int plus(int a, int b, int c) {
	System.out.println("정수 + 정수 + 정수");

		return a + b + c;
	}
	// 실수 3개를 전달받아서 합을 계산하고 반환하는 메소드
	public double plus(double a, double b, double c) {
	System.out.println("실수 + 실수 + 실수");

		return a + b + c;
	}
}