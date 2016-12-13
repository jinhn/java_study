package employee;

public class Employee {

	private int no;
	private String name;
	private int career;
	
	public Employee() {}

	public Employee(int no, String name, int career) {
		super();
		this.no = no;
		this.name = name;
		this.career = career;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
}