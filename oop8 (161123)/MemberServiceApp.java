public class MemberServiceApp {
	public static void main(String[] args) {
		
		/*
			이름: "홍길동"
			아이디: "hong"
			비밀번호: "1234"
			나이: 30
		*/

		// 정보를 가진 Member객체를 담고 있는 MemberService객체 생성하기
		Member mb = new Member();
		mb.setName("홍길동");
		mb.setId("hong");
		mb.setPassword("1234");
		mb.setAge(30);

		MemberService ms = new MemberService(mb);

		ms.loginCheck("hong", "1234");
		System.out.println(ms.isAuth());

		ms.logoutCheck();
		System.out.println(ms.isAuth());

/*
		// MemberService에 정의된 login기능 사용해보기
		boolean auth = ms.login("hong", "1234");
		System.out.println(auth);

		// MemberService에 정의된 logout기능 사용해보기
		ms.logout("hong");
*/
	}
}