public class MemberApp {
	public static void main(String[] args) {
	
		// ȸ�������� ������� Member ��ü�� �����ϰ�
		Member m = new Member();

		// setter�� ����ؼ� �̸�, ���̵�, ���, ���� ���� �����͸� ��ü�� �����ϱ�
		m.setName("ȫ�浿");
		m.setId("hong");
		m.setPassword("h1234");
		m.setAge(24);

		// ������ Member��ü�� ����� ���� getter�Լ��� ����ؼ� ȭ�鿡 ����ϱ�
		System.out.println("��    ��: " + m.getName());
		System.out.println("�� �� ��: " + m.getId());
		System.out.println("�н�����: " + m.getPassword());
		System.out.println("��    ��: " + m.getAge());
	}
}