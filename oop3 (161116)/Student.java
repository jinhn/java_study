import java.text.DecimalFormat;

public class Student {
	// ��ȣ, �̸�, ����, ����, ����
	private int no;
	private String name;
	private int kor;
	private int eng;
	private int math;

	// �⺻ ������
	public Student() {
	
	}

	public Student(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter/setter �޼ҵ� ����
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

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}

	// ����, ����� ��ȯ�ϴ� getter �޼ҵ� ����
	public int getTotal() {
		return kor + eng + math;
	}

	public double getAvg() {
		return getTotal()/3.0;
	}

	public String getAvgForRound() {
		DecimalFormat df = new DecimalFormat("##.00");
		return df.format(getAvg());
	}
}