package lms;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private int stuNo; // 학생번호
	private String stuName; // 학생이름
	private String stuId; // 학생아이디
	private String stuPwd; // 학생비번
	private String stuDept; // 학생학과
	private int grade; // 학생학년
	
	public Student() {}

	public Student(int stuNo, String stuName, String stuId, String stuPwd, String stuDept, int grade) {
		super();
		this.stuNo = stuNo;
		this.stuName = stuName;
		this.stuId = stuId;
		this.stuPwd = stuPwd;
		this.stuDept = stuDept;
		this.grade = grade;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuPwd() {
		return stuPwd;
	}

	public void setStuPwd(String stuPwd) {
		this.stuPwd = stuPwd;
	}

	public String getStuDept() {
		return stuDept;
	}

	public void setStuDept(String stuDept) {
		this.stuDept = stuDept;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}