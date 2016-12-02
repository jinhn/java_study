public class MemberService {

	// ������
	private Member member;

	// �α��� ����
	private boolean auth = false;

	// MemberŬ������ ���� member��ü�� ����
	public MemberService(Member member) {
		this.member = member;
	}

	public boolean isAuth() {
		return auth;
	}

	// ���̵�� ����� ���޹޾Ƽ� �α��� ���θ� üũ�ϰ�, auth�� ��Ƶα�
	public void loginCheck(String id, String password) {
		if (member.getId().equals(id) && member.getPassword().equals(password)) {
			auth = true;
		}
	}

	// ���̵� ���޹޾Ƽ� �α׾ƿ� ó���ϱ� (auth�� ���� false�� �ٲٱ�)
	public void logoutCheck() {
		if (auth) {
			auth = false;
		}
	}

/*
	// ���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�
	public boolean login(String id, String password) {
		boolean result = false;
		
		if (id == member.getId() && password == member.getPassword()) {
			result = true;
		}

		return result;
	}

	// ���̵� ���޹޾Ƽ� �α׾ƿ������ �����ϴ� �޼ҵ�
	public void logout(String id) {
		System.out.println("["+id+"]�� �α׾ƿ� �Ǿ����ϴ�.");
	}
*/
}