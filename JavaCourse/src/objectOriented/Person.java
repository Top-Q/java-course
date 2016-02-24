package objectOriented;

public class Person implements Walkable, Talkable{

	private String gender;
	private double height;
	protected String firstName;
	private String lastName;

	private Address address = new Address();

	// package private
	private int id;

	public Person() {
	}

	public Person(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;

	}

	public Person(int id) {
		this.id = id;

	}

	public void walk() {
		System.out.println(firstName + " is walking");
	}

	public void talk() {
		System.out.println(firstName + " is talking");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		if (gender.equals("Male") || gender.equals("Female")) {
			this.gender = gender;
		} else {
			System.err.println("Not legal");
		}
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
