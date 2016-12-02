import java.util.Scanner;

public class ForDemo7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		for (;;) {
			System.out.println();
			System.out.println("[1]조회 [2]등록 [3]삭제 [0]종료");
			System.out.print("메뉴를 선택하세요: ");
			int menuNo = sc.nextInt();

			if (menuNo == 1) {
				System.out.println("정보를 조회합니다.");
			} else if (menuNo == 2) {
				System.out.println("정보를 등록합니다.");
			} else if (menuNo == 3) {
				System.out.println("정보를 삭제합니다.");
			} else if (menuNo == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}
}