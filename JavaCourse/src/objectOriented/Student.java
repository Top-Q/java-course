package objectOriented;

public class Student extends Person {

	public Student() {
		this.firstName = "Fred";
	}

	public void learn() {
		System.out.println("" + firstName + " is learning now");
	}

	public void walk() {
		super.walk();
		System.out.println("but slowly....");
	}

}
