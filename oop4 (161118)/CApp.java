public class CApp {
	public static void main(String[] args) throws Exception {
	
		// 해당 클래스를 메모리에 로딩시켜주는 명령어
		// Class.forName("전체 클래스이름");
		Class.forName("C");

		C c1 = new C();
		C c2 = new C();
		C c3 = new C();

		System.out.println(C.y);
		System.out.println(C.y);
		System.out.println(C.y);
	}
}