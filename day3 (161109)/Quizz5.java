import java.util.Scanner;

public class Quizz5 {
	public static void main(String[] args) {
		// ����, ����, ���������� �Է¹޾Ƽ�
		// ����, ���, ������ ����ϱ�
		// ������ 90�̻�:A, 80�̻�:B, 70�̻�:C, 60�̻�:D, �� �ܴ� F
		Scanner sc = new Scanner(System.in);
		System.out.print("����: ");
		int kor = sc.nextInt();
		System.out.print("����: ");
		int eng = sc.nextInt();
		System.out.print("����: ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		int avg = total / 3;
		String grade = "";
				
		if (total >= 90) {
			grade = "A";
		} else if (total >= 80) {
			grade = "B";
		} else if (total >= 70)	{
			grade = "C";
		} else if (total >= 60)	{
			grade = "D";
		} else {
			grade = "F";
		}
		System.out.println("���� " + total + " ��� " + avg + " ���� " + grade);
	}
}