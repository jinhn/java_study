/*
score.txt ������ �о ���������� �о ȭ�鿡 ����ϴ� ���α׷�
1. �л������� ��� Student Ŭ���� �����ϱ�
2. StudentApp �����ϱ�
	- FileReader�� BufferedReader�� ����ؼ� ������ ���� �о����
	- �о�� ������ ,�� �������� �ڸ���
	- �߶� ������ Student��ü�� �����ؼ� �����ϱ�
		(������ ���ڷ� ��ȯ�ϱ�: int Integer.parseInt(����))
	- Student��ü�� ����� ������ ȭ�鿡 ǥ���ϱ�
*/
public class Student {

	private String name;
	private String grade;
	private int kor;
	private int eng;
	private int math;

	public Student() {}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;	
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
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
}