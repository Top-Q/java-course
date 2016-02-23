package objectOriented.exercise;

public class EBookReader {

	private EBook[] books = new EBook[10];

	private int lastBookIndex;

	public void addBook(EBook book) {
		books[lastBookIndex++] = book;
	}

	public EBook getBookByTitle(String title) {
		for (EBook book : books) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

}
