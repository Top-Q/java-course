package objectOriented.exercise;

public class MyEbookApplication {

	public static void main(String[] args) {
		EBookReader reader = new EBookReader();

		EpubBook epBook = new EpubBook("Harry Potter and the Cursed Child", "J.K Rolling", 312);
		epBook.setFixedWidth(28);
		reader.addBook(epBook);

		epBook = new EpubBook("When Breath Becomes Air", "Paul Kalanithi", 390);
		reader.addBook(epBook);

		MobiBook mBook = new MobiBook("To Kill a Mockingbird", "Harper Lee", 213);
		reader.addBook(mBook);

		mBook = new MobiBook("Me Before You", "Jojo Moyes", 142);
		mBook.setCompressed(true);
		reader.addBook(mBook);

		EBook book = reader.getBookByTitle("To Kill a Mockingbird");
		System.out.println("Author of '" + book.getTitle() + "' is: " + book.getAuthor());

		book.forward();
		book.forward();
		System.out.println("Current page: " + book.getCurrentPage());

		book.back();
		System.out.println("Current page: " + book.getCurrentPage());
	}

}
