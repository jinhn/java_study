public class Quizz6 {
/*
	1. �̸�, �μ�, ����, �޿��� ���� �� �ִ� Employee Ŭ���� �����ϱ�
	(�ʵ� ����, �⺻������, getter/setter)
	2. ^�� �������� ���ڿ� �߶� �迭�� ���
	3. �迭�� ��������� �ϳ��� �����ؼ� , �� �߶� �迭�� ���
	4. Employee ��ü�� ���� ��������� �� �����͸� Employee��ü�� �����ϱ�
	5. Employee ��ü�� employees �迭�� �����ϱ�
	6. employees �迭�� ����� ���� ����ϱ�
*/	
	public static class Employee {

		private String name;
		private String dept;
		private String position;
		private int salary;

		public Employee() {}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}

		public String getDept() {
			return dept;
		}
		public void setDept(String dept) {
			this.dept = dept;
		}

		public String getPosition() {
			return position;
		}
		public void setPosition(String position) {
			this.position = position;
		}

		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
	}

	public static void main(String[] args) {

		String text = "ȫ�浿,������,����,200^������,������,����,300^������,�ѹ���,�븮,150^�̼���,�ѹ���,����,250";

		Employee[] employees = new Employee[4];
		
		int index = 0;
		
		String[] sub1 = text.split("\\^");

		for (int i=0; i<sub1.length; i++) {
			String item = sub1[i];
			String[] values = item.split(",");

			Employee emp = new Employee();

			emp.setName(values[0]);
			emp.setDept(values[1]);
			emp.setPosition(values[2]);
			// ���ڷ� �̷���� ���ڿ��� ���ڷ� ��ȯ
			int salary = Integer.parseInt(values[3]);
			emp.setSalary(salary);

			employees[i] = emp;
		}

		for (Employee e : employees) {
			System.out.println("++++��������++++");
			System.out.println("�̸�: " + e.getName());
			System.out.println("�μ�: " + e.getDept());
			System.out.println("����: " + e.getPosition());
			System.out.println("����: " + e.getSalary());
			System.out.println("++++++++++++++++");
			System.out.println();
		}
	}
}