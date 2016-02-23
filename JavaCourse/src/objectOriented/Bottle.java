package objectOriented;

public class Bottle {

	String material;
	int height;
	double capacity = 1.5;
	String color = "White";
	double amount = 0;

	void fillWithLiquied(double amountInLiters) {
		if (amount + amountInLiters > capacity){
			amount = capacity;
		} else {
			amount += amountInLiters;
		}
	}

	void breakBottle() {

	}
	
	void empty(){
		
	}
	

}
