package objectOriented.exercise;

public class EBook {

	private String title;
	private String author;
	private int numOfPages;
	private int currentPage;

	public EBook(String title, String author, int numOfPages) {
		this.title = title;
		this.author = author;
		this.numOfPages = numOfPages;
	}

	public void forward() {
		currentPage++;

	}

	public void back() {
		currentPage--;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	
	

}
