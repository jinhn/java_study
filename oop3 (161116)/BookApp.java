public class BookApp {
	public static void main(String[] args) {
		Book[] bookCart = new Book[5];

		bookCart[0] = new Book(1, "�̰��� �ڹٴ�", "ȫ�浿", "�Ѻ��̵��", 35000, "2015-10-10");
		bookCart[1] = new Book(2, "�ڹ� �� �׼�", "������", "�Ѻ��̵��", 33000, "2015-05-10");
		bookCart[2] = new Book(3, "������ �����ӿ�ũ", "������", "�Ѻ��̵��", 27000, "2013-01-10");
		bookCart[3] = new Book(5, "������ ��ť��Ƽ", "�̼���", "�Ѻ��̵��", 40000, "2014-04-10");
		bookCart[4] = new Book(7, "�ڹ� �� ���α׷���", "����", "�Ѻ��̵��", 30000, "2015-11-23");
	
		// īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for (Book bk : bookCart)	{
			System.out.println("����: " + bk.getTitle());
		}
		System.out.println();
		// īƮ�� ����� å���� ���� ������ ǥ���ϱ�
		int totalPrice = 0;
		for (Book bk : bookCart) {
			totalPrice += bk.getPrice();
		}
		System.out.println("�� ����: " + totalPrice + "��");
		System.out.println();
		// īƮ�� ����� å�߿��� ���� ��� ������ å ����� ������ ǥ���ϱ�
		int ePrice = 0;
		String eTitle = null;
		for (Book bk : bookCart) {
			if (bk.getPrice() > ePrice) {
				ePrice = bk.getPrice();
				eTitle = bk.getTitle();
			}
		}
		System.out.println("���� ��� å�� "+ eTitle + " ������ " + ePrice + "��");
	}
}