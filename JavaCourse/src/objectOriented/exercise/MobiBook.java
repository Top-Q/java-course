package objectOriented.exercise;

public class MobiBook extends EBook {
	
	private boolean compressed;
	
	public MobiBook(String title, String author, int numOfPages) {
		super(title, author, numOfPages);
	}

	public boolean isCompressed() {
		return compressed;
	}

	public void setCompressed(boolean compressed) {
		this.compressed = compressed;
	}
	
	

}
