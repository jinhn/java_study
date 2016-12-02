public class EmployeeApp {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empNo = 123;
		e.name = "È«±æµ¿";
		e.phoneNum = "010-1111-1111";
		e.department = "°³¹ßÆÀ";
		e.position = "»ç¿ø";
		e.salary = 2500000;

		int annualSalary = e.getAnnualSalary();
		System.out.printf("¿¬ºÀ: %d¿ø\n", annualSalary);

		e.empInfo();
	}
}