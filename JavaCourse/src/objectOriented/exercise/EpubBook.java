package objectOriented.exercise;

public class EpubBook extends EBook {

	private int fixedWidth;
	
	public EpubBook(String title, String author, int numOfPages) {
		super(title, author, numOfPages);
	}

	public int getFixedWidth() {
		return fixedWidth;
	}

	public void setFixedWidth(int fixedWidth) {
		this.fixedWidth = fixedWidth;
	}
	
	

}
