package lms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseMgr {

	Scanner sc = new Scanner(System.in);

	ArrayList<Student> students = new ArrayList<>();
	ArrayList<Professor> professors = new ArrayList<>();
	ArrayList<Course> courses = new ArrayList<>();

	Professor loginedProfessor = null;
	Student loginedStudent = null;

	public Professor getLoginedProfessor() {
		return loginedProfessor;
	}

	public Student getLoginedStudent() {
		return loginedStudent;
	}

	int profNo = 0;
	int stuNo = 0;

	public CourseMgr() {}
	
	public void fileChk() throws Exception {
		File professorFile = new File("Professor.sav");
		File studentFile = new File("Student.sav");
		File courseFile = new File("Course.sav");
		if (!professorFile.isFile()) {
			ObjectOutputStream oosPro = new ObjectOutputStream(new FileOutputStream("Professor.sav"));
			oosPro.writeObject(professors);
			oosPro.close();			
		}
		if (!studentFile.isFile()) {
			ObjectOutputStream oosStu = new ObjectOutputStream(new FileOutputStream("Student.sav"));
			oosStu.writeObject(students);
			oosStu.close();			
		}
		if (!courseFile.isFile()) {
			ObjectOutputStream oosCos = new ObjectOutputStream(new FileOutputStream("Course.sav"));
			oosCos.writeObject(courses);
			oosCos.close();			
		}	
	}
	
	@SuppressWarnings("unchecked")
	public void load() throws Exception {
		try {
			ObjectInputStream oisPro = new ObjectInputStream(new FileInputStream("Professor.sav"));
			professors = (ArrayList<Professor>) oisPro.readObject();
			oisPro.close();
			
			ObjectInputStream oisStu = new ObjectInputStream(new FileInputStream("Student.sav"));
			students = (ArrayList<Student>) oisStu.readObject();
			oisStu.close();
			
			ObjectInputStream oisCos = new ObjectInputStream(new FileInputStream("Course.sav"));
			courses = (ArrayList<Course>) oisCos.readObject();
			oisCos.close();			
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public void profRegister() { // 1.교수가입

		Professor pro = new Professor();

		pro.setProNo(profNo++);
		System.out.println("이름을 입력하세요 > ");
		pro.setProName(sc.nextLine());
		System.out.println("아이디를 입력하세요 > ");
		pro.setProId(sc.nextLine());
		System.out.println("비밀번호를 입력하세요 > ");
		pro.setProPwd(sc.nextLine());
		System.out.println("학과를 입력하세요 > ");
		pro.setProDept(sc.nextLine());
		System.out.println("직위를 입력하세요 > ");
		pro.setPosition(sc.nextLine());

		System.out.println("가입이 완료되었습니다.");

		professors.add(pro);
	}

	public void stuRegister() { // 2.학생가입

		Student stu = new Student();

		stu.setStuNo(stuNo++);
		System.out.println("이름을 입력하세요 > ");
		stu.setStuName(sc.nextLine());
		System.out.println("아이디를 입력하세요 > ");
		stu.setStuId(sc.nextLine());
		System.out.println("비밀번호를 입력하세요 > ");
		stu.setStuPwd(sc.nextLine());
		System.out.println("학과를 입력하세요 > ");
		stu.setStuDept(sc.nextLine());
		System.out.println("학년을 입력하세요 > ");
		stu.setGrade(Integer.parseInt(sc.nextLine()));

		System.out.println("가입이 완료되었습니다.");

		students.add(stu);
	}

	public void profLogin() { // 3.교수로그인

		System.out.println("아이디를 입력하세요 > ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 > ");
		String pwd = sc.nextLine();

		for (Professor pro : professors) {
			if (id.equals(pro.getProId())) {
				if (pwd.equals(pro.getProPwd())) {
					System.out.printf("%s님 로그인되었습니다.\n", pro.getProId());
					loginedProfessor = pro;
				}
			}
		}

		if (loginedProfessor == null) {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	public void stuLogin() { // 4.학생로그인

		System.out.println("아이디를 입력하세요 > ");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요 > ");
		String pwd = sc.nextLine();

		for (Student stu : students) {
			if (id.equals(stu.getStuId())) {
				if (pwd.equals(stu.getStuPwd())) {
					System.out.printf("%s님 로그인되었습니다.\n", stu.getStuId());
					loginedStudent = stu;
				}
			}
		}

		if (loginedStudent == null) {
			System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
		}
	}

	public void proCourseRegister() throws Exception { // 1.과목등록

		Course cos = new Course();

		System.out.println("과목코드를 입력하세요 > ");
		cos.setCourseCode(sc.nextLine());
		System.out.println("과목이름을 입력하세요 > ");
		cos.setCourseName(sc.nextLine());
		cos.setCourseProf(loginedProfessor);
		System.out.println("과목정원을 입력하세요 > ");
		cos.setCourseLimit(Integer.parseInt(sc.nextLine()));

		courses.add(cos);

//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Course.sav"));
//		oos.writeObject(courses);
//		oos.close();
	}

	public void proCourseInfo() { // 2.등록과목조회
		System.out.println("--------과목--------");
		for (Course course : courses) {
			if (course.getCourseProf().getProId().equals(loginedProfessor.getProId())) {
				System.out.println("과목코드: " + course.getCourseCode());
				System.out.println("과목이름: " + course.getCourseName());
				System.out.println("과목교수: " + loginedProfessor.getProId());
				System.out.println("과목정원: " + course.getCourseLimit() + "명");
				System.out.println("--------------------------------");
			}
		}
	}

	public void proCourseStuList() { // 3.수강신청학생조회
		System.out.println("--------수강신청학생--------");
		for (Course course : courses) {
			if (course.getCourseProf().getProId().equals(loginedProfessor.getProId())) {
				System.out.println("과목코드: " + course.getCourseCode());
				System.out.println("과목이름: " + course.getCourseName());
				System.out.println("과목교수: " + loginedProfessor.getProId());
				System.out.printf("신청한 학생 수: %d명/%d명\n", course.getCourseStus().size(), course.getCourseLimit());
				System.out.println("--------------------------------");
			}
		}
	}

	public void proLogout() { // 0.교수로그아웃
		System.out.println("로그아웃 되었습니다.");
		loginedProfessor = null;
	}

	public void stuCourseList() { // 1.과목조회
		System.out.println("--------개설과목--------");
		for (Course course : courses) {
			System.out.println("과목코드: " + course.getCourseCode());
			System.out.println("과목이름: " + course.getCourseName());
			System.out.println("과목교수: " + course.getCourseProf().getProId());
			System.out.println("과목정원: " + course.getCourseLimit() + "명");
			System.out.println("--------------------------------");
		}
	}

	public void stuCourseApply() throws Exception { // 2.수강신청
		System.out.println("수강하실 과목명을 입력하세요 > ");
		String name = sc.nextLine();
		System.out.println("과목 교수 이름을 입력하세요 > ");
		String prof = sc.nextLine();
		for (Course course : courses) {
			if (name.equals(course.getCourseName())) {
				if (prof.equals(course.getCourseProf().getProName())) {
					System.out.printf("%s 과목이 신청완료되었습니다.\n", course.getCourseName());
					course.getCourseStus().add(loginedStudent);
					return;
				}
			}
		}
	}

	public void stuCourseInfo() throws Exception { // 3.수강신청과목조회
		System.out.println("--------수강신청과목--------");
		for (Course course : courses) {
			for (Student student : course.getCourseStus()) {
				if (student.getStuId().equals(loginedStudent.getStuId())) {
					System.out.println("과목코드: " + course.getCourseCode());
					System.out.println("과목이름: " + course.getCourseName());
					System.out.println("과목교수: " + course.getCourseProf().getProId());
					System.out.println("--------------------------------");
				}
			}
		}
	}

	public void stuLogout() { // 0.학생로그아웃
		System.out.println("로그아웃 되었습니다.");
		loginedStudent = null;
	}

	public void save() throws Exception {
		ObjectOutputStream oosPro = new ObjectOutputStream(new FileOutputStream("Professor.sav"));
		oosPro.writeObject(professors);
		oosPro.flush();
		oosPro.close();
		
		ObjectOutputStream oosStu = new ObjectOutputStream(new FileOutputStream("Student.sav"));
		oosStu.writeObject(students);
		oosStu.flush();
		oosStu.close();
		
		ObjectOutputStream oosCos = new ObjectOutputStream(new FileOutputStream("Course.sav"));
		oosCos.writeObject(courses);
		oosCos.flush();
		oosCos.close();
	}
}