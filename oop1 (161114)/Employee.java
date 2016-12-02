public class Employee {
	// 속성
    // 사원번호, 이름, 전화번호, 소속부서, 직위, 급여
	int empNo;
	String name;
	String phoneNum;
	String department;
	String position;
	int salary;

    // 기능
    // 연봉을 계산해서 반환하는 메소드
	public int getAnnualSalary() {
		return salary * 12;
	}
    // 사원의 모든 정보를 출력하는 메소드
	public void empInfo() {
		System.out.println("############사원정보############");
		System.out.printf("사원번호는 %d번 입니다.\n", empNo);
		System.out.printf("이름은 %s 입니다.\n", name);
		System.out.printf("연락처는 %s 입니다.\n", phoneNum);
		System.out.printf("소속부서는 %s 입니다.\n", department);
		System.out.printf("직급은 %s 입니다.\n", position);
		System.out.printf("연봉은 %d원 입니다.\n", getAnnualSalary());
		System.out.println("################################");
	}
}