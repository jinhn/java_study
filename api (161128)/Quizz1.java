import java.util.Scanner;

public class Quizz1 {
	public static void main(String[] args) {
	
		// �̸����� �Է¹޾Ƽ� �̸��Ͽ� ���Ե� ���̵�κи� ����ϱ�

		Scanner sc = new Scanner(System.in);

		System.out.print("�̸����� �Է��ϼ���: ");
		String email = sc.next();
		String[] id = email.split("@");
		System.out.println("ID��: " + id[0] + "�Դϴ�.");

		int index = email.indexOf("@");
		String id1 = email.substring(0, index);
		System.out.println("ID��: " + id1 + "�Դϴ�.");
	}
}