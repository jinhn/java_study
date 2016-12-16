package lms;

import java.util.Scanner;

public class CourseApp {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		CourseMgr courseMgr = new CourseMgr();

		courseMgr.fileChk();
		courseMgr.load();

		while (true) {
			System.out.println("======================================================");
			System.out.println("1.교수가입 2.학생가입 3.교수로그인 4.학생로그인 0.종료");
			System.out.println("======================================================");
			System.out.println("번호를 입력하세요 > ");
			int menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				courseMgr.profRegister();
			} else if (menu == 2) {
				courseMgr.stuRegister();
			} else if (menu == 3) {
				courseMgr.profLogin();
				if (courseMgr.getLoginedProfessor() != null) {
					while (true) {
						System.out.println("=======================================================");
						System.out.println("1.과목등록 2.등록과목조회 3.수강신청학생조회 0.로그아웃");
						System.out.println("=======================================================");
						System.out.println("번호를 입력하세요 > ");
						int profMenu = Integer.parseInt(sc.nextLine());

						if (profMenu == 1) {
							courseMgr.proCourseRegister();
						} else if (profMenu == 2) {
							courseMgr.proCourseInfo();
						} else if (profMenu == 3) {
							courseMgr.proCourseStuList();
						} else if (profMenu == 0) {
							courseMgr.proLogout();
							break;
						}
					}
				}
			} else if (menu == 4) {
				courseMgr.stuLogin();
				if (courseMgr.getLoginedStudent() != null) {
					while (true) {
						System.out.println("===================================================");
						System.out.println("1.과목조회 2.수강신청 3.수강신청과목조회 0.로그아웃");
						System.out.println("===================================================");
						System.out.println("번호를 입력하세요 > ");
						int stuMenu = Integer.parseInt(sc.nextLine());

						if (stuMenu == 1) {
							courseMgr.stuCourseList();
						} else if (stuMenu == 2) {
							courseMgr.stuCourseApply();
						} else if (stuMenu == 3) {
							courseMgr.stuCourseInfo();
						} else if (stuMenu == 0) {
							courseMgr.stuLogout();
							break;
						}
					}
				}
			} else if (menu == 0) {
				courseMgr.save();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		sc.close();
	}
}