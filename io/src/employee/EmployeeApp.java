package employee;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) throws Exception {
			
			Scanner sc = new Scanner(System.in);
			ArrayList<Employee> list = new ArrayList<>();
			FileOutputStream fos = new FileOutputStream("EmpList.txt");
			FileOutputStream fos2 = new FileOutputStream("EmpList2.txt");
			
		while (true) {
			System.out.println("1.회원등록 2.가나다순정렬 3.경력순정렬 0.종료");
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				Employee person = new Employee();
				
				System.out.println("순번입력: ");
				int no = Integer.parseInt(sc.nextLine());
				System.out.println("이름입력: ");
				String name = sc.nextLine();
				System.out.println("경력입력: ");
				int career = Integer.parseInt(sc.nextLine());
				
				person.setNo(no);
				person.setName(name);
				person.setCareer(career);
				
				list.add(person);
			} else if (menu == 2) {
				Collections.sort(list, new Comparator<Employee>() {
					public int compare(Employee e1, Employee e2) {
						return e1.getName().compareTo(e2.getName());
					}
				});
				
				for (Employee employee : list) {
					String text = employee.getNo() + ", " + employee.getName() + ", " + employee.getCareer() + System.lineSeparator();
					byte[] bytes = text.getBytes();
					fos.write(bytes);
				}
				fos.close();
			} else if (menu == 3) {
				Comparator<Employee> com = new Comparator<Employee>() {
					public int compare(Employee e1, Employee e2) {
						return e2.getCareer() - e1.getCareer();
					}
				};
				
				Collections.sort(list, com);
				
				for (Employee employee : list) {
					String text = employee.getNo() + ", " + employee.getName() + ", " + employee.getCareer() + System.lineSeparator();
					byte[] bytes = text.getBytes();
					fos2.write(bytes);
				}
				fos2.close();
			} else if (menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
		}
	}
}
