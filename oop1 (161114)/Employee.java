public class Employee {
	// �Ӽ�
    // �����ȣ, �̸�, ��ȭ��ȣ, �ҼӺμ�, ����, �޿�
	int empNo;
	String name;
	String phoneNum;
	String department;
	String position;
	int salary;

    // ���
    // ������ ����ؼ� ��ȯ�ϴ� �޼ҵ�
	public int getAnnualSalary() {
		return salary * 12;
	}
    // ����� ��� ������ ����ϴ� �޼ҵ�
	public void empInfo() {
		System.out.println("############�������############");
		System.out.printf("�����ȣ�� %d�� �Դϴ�.\n", empNo);
		System.out.printf("�̸��� %s �Դϴ�.\n", name);
		System.out.printf("����ó�� %s �Դϴ�.\n", phoneNum);
		System.out.printf("�ҼӺμ��� %s �Դϴ�.\n", department);
		System.out.printf("������ %s �Դϴ�.\n", position);
		System.out.printf("������ %d�� �Դϴ�.\n", getAnnualSalary());
		System.out.println("################################");
	}
}