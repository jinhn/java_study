public class EmployeeApp {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empNo = 123;
		e.name = "ȫ�浿";
		e.phoneNum = "010-1111-1111";
		e.department = "������";
		e.position = "���";
		e.salary = 2500000;

		int annualSalary = e.getAnnualSalary();
		System.out.printf("����: %d��\n", annualSalary);

		e.empInfo();
	}
}