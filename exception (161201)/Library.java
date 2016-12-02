public class Library {
		
		private Book[] db = new Book[100];
		
		private int position = 0;

		public void addBook(Book newbook) throws LibraryException {
			
			for (Book book : db) {
				if (book != null) {
					if (book.getNo() == newbook.getNo()) {
						throw new LibraryException("������ ��ȣ�� å�� �����մϴ�.");	
					}
				}
			}

			db[position++] = newbook;
		}

		public void findBooksByNo(int no) throws LibraryException {
			boolean isExist = false;

			for (Book book : db) {
				if (book != null) {
					if (book.getNo() == no) {
						isExist = true;
						System.out.println("��ȣ: " + book.getNo());
						System.out.println("����: " + book.getName());
						System.out.println("����: " + book.getAuthor());
						System.out.println("���ǻ�: " + book.getPublisher());
						System.out.println("����: " + book.getPrice());
						System.out.println("�帣: " + book.getGenre());
					}
				}
			}

			if (!isExist) {
				throw new LibraryException("��ȣ�� �ش��ϴ� å�� �����ϴ�.");
			}
		}

		public void findBooksByTitle(String title) throws LibraryException {
			boolean isExist = false;
		
			for (Book book : db) {
				if (book != null) {
					if (book.getName().contains(title)) {
						isExist = true;
						System.out.println("��ȣ\t����\t����\t���ǻ�\t����\t�帣");
						System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n",
							book.getNo(), book.getName(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());
					}
				}
			}

			if (!isExist) {
				throw new LibraryException("���� �ش��ϴ� å�� �����ϴ�.");
			}
		}

		public void findBooksByGenre(String genre) throws LibraryException {
			boolean isExist = false;
		
			for (Book book : db) {
				if (book != null) {
					if (book.getGenre().contains(genre)) {
						isExist = true;
						System.out.println("��ȣ\t����\t����\t���ǻ�\t����\t�帣");
						System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n",
							book.getNo(), book.getName(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());
					}
				}
			}

			if (!isExist) {
				throw new LibraryException("�帣�� �ش��ϴ� å�� �����ϴ�.");
			}
		}
	}