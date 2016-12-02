public class Library {
		
		private Book[] db = new Book[100];
		
		private int position = 0;

		public void addBook(Book newbook) throws LibraryException {
			
			for (Book book : db) {
				if (book != null) {
					if (book.getNo() == newbook.getNo()) {
						throw new LibraryException("동일한 번호의 책이 존재합니다.");	
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
						System.out.println("번호: " + book.getNo());
						System.out.println("제목: " + book.getName());
						System.out.println("저자: " + book.getAuthor());
						System.out.println("출판사: " + book.getPublisher());
						System.out.println("가격: " + book.getPrice());
						System.out.println("장르: " + book.getGenre());
					}
				}
			}

			if (!isExist) {
				throw new LibraryException("번호에 해당하는 책이 없습니다.");
			}
		}

		public void findBooksByTitle(String title) throws LibraryException {
			boolean isExist = false;
		
			for (Book book : db) {
				if (book != null) {
					if (book.getName().contains(title)) {
						isExist = true;
						System.out.println("번호\t제목\t저자\t출판사\t가격\t장르");
						System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n",
							book.getNo(), book.getName(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());
					}
				}
			}

			if (!isExist) {
				throw new LibraryException("제목에 해당하는 책이 없습니다.");
			}
		}

		public void findBooksByGenre(String genre) throws LibraryException {
			boolean isExist = false;
		
			for (Book book : db) {
				if (book != null) {
					if (book.getGenre().contains(genre)) {
						isExist = true;
						System.out.println("번호\t제목\t저자\t출판사\t가격\t장르");
						System.out.printf("%d\t%s\t%s\t%s\t%d\t%s\n",
							book.getNo(), book.getName(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getGenre());
					}
				}
			}

			if (!isExist) {
				throw new LibraryException("장르에 해당하는 책이 없습니다.");
			}
		}
	}