import java.util.Scanner;
//import java.util.regex.Pattern;

public class Quizz4 {
	public static void main(String[] args) {
	
		// ���̵� �Է¹޾Ƽ� �ùٸ� ���̵����� �˻��ϱ�
		// ���̵� �ۼ� ��Ģ(���̰� 6���� �̻�, ����ҹ���) 97-122����
	
		Scanner sc = new Scanner(System.in);

		System.out.print("���̵� �Է��ϼ���:");
		String userId = sc.next();

		// ���̵� 6���� �̻����� �˻��ϱ�

		if (userId.length() < 6) {
			System.out.println("6���� �̻� �Է��ϼ���.");
			return;
		}

		// ���̵� ���� �ҹ��ڷθ� �����Ǿ����� �˻��ϱ� <- boolean
		boolean invalid = false;
		// <--Flag ���� : ���� ������ Ư�� ���¸� �����ϴ� ����
		// Flag ���� ��� �� else�� ��츦 ������ �ȵȴ�.

		for (int i=0; i<userId.length(); i++) {
			int id = (int) userId.charAt(i);
			if (id < 97 || id > 122) {
				invalid = true;
				break; // �ݺ����� Ż���Ҷ��� ���
			}
		}
		if (invalid) {
			System.out.println("�ҹ��ڸ� �Է��ϼ���.");
		}

//		boolean vaild = false;
//		String regExp = "^[a-z]{6,}$";
//		valid = Pattern.matches(regExp, userId);
//		if (!valid) {
//			System.out.println("��ȿ���� ����");
//		}

	}
}