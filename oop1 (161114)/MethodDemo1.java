public class MethodDemo1 {
	// 메소드 정의(구현)
	public static void a() {
		System.out.println("사용자가 정의한 a 메소드입니다.");
	}
	// 매개변수(int x)를 가지고 있는 메소드 정의
	// 매개변수는 메소드 실행에 필요한 값을 전달받아서 담는다.
	public static void b(int x) {
		System.out.println("b메소드가 실행되었습니다.");
		System.out.println("b메소드 실행시 전달받은 값: " + x);
	}

	public static void c(String  str) {
		System.out.println("c메소드가 실행되었습니다.");
		System.out.println("c메소드 실행시 전달받은 값: " + str);
	}

	public static void d(int x, int y) {
		System.out.println("d메소드가 실행되었습니다.");
		System.out.println("d메소드 실행시 전달받은 값: " + x + ", " + y);
	}

	public static void e(String name, String email, int age) {
		System.out.println("e메소드가 실행되었습니다.");
		System.out.println("e메소드 실행시 전달받은 값: " + name);
		System.out.println("e메소드 실행시 전달받은 값: " + email);
		System.out.println("e메소드 실행시 전달받은 값: " + age);
	}
	
//	접근제한자 static 리턴타입 메소드이름(매개변수, 매개변수, ....) {}
	public static void main(String[] args) {
		// 메소드 호출(실행)
		a();
		// 매개변수가 있는 메소드 호출
		b(100);
		int k = 20;
		b(k);
//		b(); 컴파일오류

		c("홍길동");
		c("안녕, " + "저는 홍길동입니다.");

		d(1, 4);
		int i = 10;
		int j = 20;
		d(i, j);

		e("홍길동", "hong@gmail.com", 23);
		e("김유신", "kim@gmail.com", j);
	}
}