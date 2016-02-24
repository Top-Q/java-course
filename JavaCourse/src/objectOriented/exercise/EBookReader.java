package objectOriented.exercise;

public class EBookReader {

	private EBook[] books = new EBook[100];

	public void addBook(EBook book) {
		for (int i = 0 ; i < books.length ; i++){
			if (books[i] == null){
				books[i] = book;
				return;
			}
		}
		System.err.println("No storage left for books");
	}

	public EBook getBookByTitle(String title) {
		for (EBook book : books) {
			if (book == null){
				continue;
			}
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

}
