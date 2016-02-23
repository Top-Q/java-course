package objectOriented;

public class MyBottleApplication {

	public static void main(String[] args) {
		Bottle myBottle = new Bottle();

		myBottle.fillWithLiquied(1.0);
		myBottle.fillWithLiquied(1.0);
		System.out.println(myBottle.amount);

		Bottle anotherBottle = new Bottle();
		System.out.println(anotherBottle.amount);

	}

}
