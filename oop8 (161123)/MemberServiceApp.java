public class MemberServiceApp {
	public static void main(String[] args) {
		
		/*
			�̸�: "ȫ�浿"
			���̵�: "hong"
			��й�ȣ: "1234"
			����: 30
		*/

		// ������ ���� Member��ü�� ��� �ִ� MemberService��ü �����ϱ�
		Member mb = new Member();
		mb.setName("ȫ�浿");
		mb.setId("hong");
		mb.setPassword("1234");
		mb.setAge(30);

		MemberService ms = new MemberService(mb);

		ms.loginCheck("hong", "1234");
		System.out.println(ms.isAuth());

		ms.logoutCheck();
		System.out.println(ms.isAuth());

/*
		// MemberService�� ���ǵ� login��� ����غ���
		boolean auth = ms.login("hong", "1234");
		System.out.println(auth);

		// MemberService�� ���ǵ� logout��� ����غ���
		ms.logout("hong");
*/
	}
}