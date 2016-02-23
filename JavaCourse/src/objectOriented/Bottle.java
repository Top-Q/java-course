package objectOriented;

public class Bottle {

	private String material;
	private int height;
	private double maxCapacity = 1.5;
	private String color = "White";
	private double amountInLiters = 0;

	Bottle() {
	}

	Bottle(double maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	
	Bottle(double maxCapacity, String color) {
		this.maxCapacity = maxCapacity;
		this.color = color;
	}


	void fillWithLiquid(double amountInLitersToFill) {
		if (amountInLiters + amountInLitersToFill > maxCapacity) {
			amountInLiters = maxCapacity;
		} else {
			amountInLiters += amountInLitersToFill;
		}
	}

	void breakBottle() {

	}

	void empty() {

	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public double getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(double maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getAmountInLiters() {
		return amountInLiters;
	}

	public void setAmountInLiters(double amountInLiters) {
		this.amountInLiters = amountInLiters;
	}

}
