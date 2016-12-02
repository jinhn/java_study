public class EmployeeApp {

	public static void main(String[] args) {
	
		// 5���� ��������� �����ϱ�
		Employee[] employees = new Employee[3];

		// �������
		Employee emp1 = new Employee();
		emp1.no = 23;
		emp1.name = "ȫ�浿";

		// ������� ����
		Sales emp2 = new Sales();
		emp2.no = 25;
		emp2.name = "�̼���";
		emp2.goal = 50;
		emp2.result = 37;

		// ���ߺ� ��� ����
		Developer emp3 = new Developer();
		emp3.no = 27;
		emp3.name = "������";
		emp3.todo = 10;
		emp3.completed = 4;

		// �迭�� ������� ����
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;

		// �� ����ϱ�
		//employees[0].print();
		//employees[1].print();
		//employees[2].print();
		// ��
		//for (int i=0; i<employees.length; i++) {
		//	employees[i].print();
		//}
		// ��
		for (Employee e : employees) {
			//e.print();

			// instanceof�� ����ϸ�
			// Employee���� Sales���� Developer���� �˾Ƴ� �� �ִ�.
			//boolean v = e instanceof Employee;
			//System.out.println(v);

			// instanceof
			// -> e ���������� �ٶ󺸴� ��ü�� SalesŬ������ ��ü���� �ƴ���
			if (e instanceof Sales) {
				// ((Sales) e) -> Sales�� �ִ� �޼ҵ� ���
				((Sales) e).drawGraph();
			} else if (e instanceof Developer) {
				((Developer) e).develop();
			}
		}
	}
}