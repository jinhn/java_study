import java.util.Scanner;

public class LibraryApp {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Library lib = new Library();

		while (true) { // ���ѷ���
			System.out.println("----------------------------------------------");
			System.out.println("1.��� 2.��ȣ�˻� 3.����˻� 4.�帣�˻� 0.����");
			System.out.println("----------------------------------------------\n");

			System.out.print("����> ");
			int menu = Integer.parseInt(sc.nextLine());

			try {
				if (menu == 1) {
					System.out.print("��ȣ �Է�: ");
					int no = Integer.parseInt(sc.nextLine());
					System.out.print("���� �Է�: ");
					String name = sc.nextLine();
					System.out.print("���� �Է�: ");
					String author = sc.nextLine();
					System.out.print("���ǻ� �Է�: ");
					String publisher = sc.nextLine();
					System.out.print("���� �Է�: ");
					int price = Integer.parseInt(sc.nextLine());
					System.out.print("�帣 �Է�: ");
					String genre = sc.nextLine();

					Book book = new Book();
					// setter �̿��ؼ� å ���� ���
					book.setNo(no);
					book.setName(name);
					book.setAuthor(author);
					book.setPublisher(publisher);
					book.setPrice(price);
					book.setGenre(genre);

					// library��ü�� addBook(Book��ü)�����ؼ� å��ü �����ϱ�
					lib.addBook(book);

				} else if (menu == 2) {
					System.out.print("��ȣ�Է�: ");
					int no = Integer.parseInt(sc.nextLine());
					lib.findBooksByNo(no);
				} else if (menu == 3) {
					System.out.print("�����Է�: ");
					String name = sc.nextLine();
					lib.findBooksByTitle(name);
				} else if (menu == 4) {
					System.out.print("�帣�Է�: ");
					String genre = sc.nextLine();
					lib.findBooksByGenre(genre);
				} else if (menu == 0) {
					System.out.println("���α׷��� �����մϴ�.");
					break;
				}
			} catch(LibraryException e) {
				System.out.println("���� ���� ���α׷� ����");
				System.out.println("���� �޼���: " + e.getMessage());
			} catch(Exception e) {
				System.out.println("�˷����� ���� ������ �߻��Ͽ����ϴ�.");
				System.out.println("���� �޼���: " + e.getMessage());
			}
		}
	}
}