package lms;

import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	private String courseCode; // 과목코드
	private String courseName; // 과목이름
	private Professor courseProf; // 과목교수
	private int courseLimit; // 과목정원
	private ArrayList<Student> courseStus = new ArrayList<>(); // 수강신청한 학생들
	
	public Course() {}

	public Course(String courseCode, String courseName, Professor courseProf, int courseLimit,
			ArrayList<Student> courseStus) {
		super();
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.courseProf = courseProf;
		this.courseLimit = courseLimit;
		this.courseStus = courseStus;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Professor getCourseProf() {
		return courseProf;
	}

	public void setCourseProf(Professor courseProf) {
		this.courseProf = courseProf;
	}

	public int getCourseLimit() {
		return courseLimit;
	}

	public void setCourseLimit(int courseLimit) {
		this.courseLimit = courseLimit;
	}

	public ArrayList<Student> getCourseStus() {
		return courseStus;
	}

	public void setCourseStus(ArrayList<Student> courseStus) {
		this.courseStus = courseStus;
	}	
}