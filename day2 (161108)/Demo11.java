public class Demo11 {
	public static void main(String[] args) {
		// 대입 연산자
		// 우선순위가 가장 낮다.
		// 우변의 값을 좌변에 대입
		int a = 20;
		int b = a;
		System.out.println("a의 값: " + a);
		System.out.println("b의 값: " + b);

		// += -= *= /= %=
		int x = 10;
		x = x + 3;
		x += 3;
		System.out.println(x);
		x = 3;
		x = x - 3;
		x -= 3;
		System.out.println(x);
	}
}