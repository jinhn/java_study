public class StudentApp {
	public static void main(String[] args) {
		Student st = new Student();

		st.no = 1;
		st.name = "ȫ�浿";
		st.kor = 80;
		st.eng = 70;
		st.math = 74;

		System.out.println("����: " + st.total());
		System.out.println();
		System.out.println("���: " + st.avg());
		System.out.println();
		st.info();
		System.out.println();
		
		// ��� �ʵ带 �ʱ�ȭ�ϴ� ������
		Student st2 = new Student(2, "������", 75, 60, 35);

		System.out.println("����: " + st2.total());
		System.out.println();
		System.out.println("���: " + st2.avg());
		System.out.println();
		st2.info();
		System.out.println();
	}
}