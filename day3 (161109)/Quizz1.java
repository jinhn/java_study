import java.util.*;

public class Quizz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ����, ����, ���������� �Է¹޾Ƽ�
		// ���հ� ����� ����ϱ�
		System.out.print("��������: ");
		int kor = sc.nextInt();
		System.out.print("��������: ");
		int eng = sc.nextInt();
		System.out.print("��������: ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = total/3;

		System.out.println("����: " + total + "\t���: " + avg);
	}
}