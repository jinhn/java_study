public class SwitchDemo {
	public static void main(String[] args) {
		
		String grade = "Silver";

		switch (grade) {
		case "Gold":
			System.out.println("�����");
			break;
		case "Silver":
			System.out.println("�ǹ����");
			break;
		case "Bronze":
			System.out.println("�������");
			break;
		default:
			System.out.println("�Ϲݵ��");
		}
	}
}