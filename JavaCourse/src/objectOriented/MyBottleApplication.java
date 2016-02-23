package objectOriented;

public class MyBottleApplication {

	public static void main(String[] args) {
		Bottle myBottle = new Bottle(1.5);

		myBottle.fillWithLiquid(1.0);
		myBottle.fillWithLiquid(1.0);
		System.out.println(myBottle.getAmountInLiters());

		
		Bottle anotherBottle = new Bottle();
		System.out.println(anotherBottle.getAmountInLiters());

	}

}
