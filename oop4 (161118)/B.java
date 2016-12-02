public class B {
	int x;
	static int y;

	// m2()나 m4()를 실행할 수 있는 시점에
	// x, m1(), m3()은 아직 설계도 상태이다.
	// static 메소드에서는 non-static변수를 사용할 수 없다.

	// m1()을 사용할 시점에 객체가 만들어져 있으므로 사용가능
	public void m1() {
		System.out.println(x);
		System.out.println(y);
	}

	// static 메소드에서는 non-static변수를 사용할 수 없다.
	// this를 사용할 수 없다.
	// x는 객체가 만들어져야 실행가능
	// m2()메소드는 클래스에 로드되는 순간 바로 실행가능상태인 반면
	// x는 객체 생성 후 만들어짐 컴파일 오류발생
	public static void m2() {
		//System.out.println(x); // 컴파일 오류
		System.out.println(y);
	}

	public void m3() {
		m1();
		m2();
	}

	// static 메소드에서는 non-static변수를 사용할 수 없다.
	public static void m4() {
		//m1(); // 컴파일 오류
		m2();
	}
}