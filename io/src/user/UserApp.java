package user;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		UserFunction function = new UserFunction();
		
		while (true) {
			System.out.println("==============================");
			System.out.println("1.회원가입   2.로그인   0.종료");
			System.out.println("==============================");
			System.out.print("번호를 입력하세요 > ");			
			int menu = Integer.parseInt(sc.nextLine());
			
			if (menu == 1) {
				function.register();
			} else if (menu == 2) {
				function.login();
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}