import java.util.Scanner;

public class Quizz1 {
	public static void main(String[] args) {
	
		// 이메일을 입력받아서 이메일에 포함된 아이디부분만 출력하기

		Scanner sc = new Scanner(System.in);

		System.out.print("이메일을 입력하세요: ");
		String email = sc.next();
		String[] id = email.split("@");
		System.out.println("ID는: " + id[0] + "입니다.");

		int index = email.indexOf("@");
		String id1 = email.substring(0, index);
		System.out.println("ID는: " + id1 + "입니다.");
	}
}