package objectOriented;

public class MyPersonApplication {

	public static void main(String[] args) {
		Person john = new Person(111, "John", "Doe");

		john.setGender("Male");

		john.walk();
		john.talk();
		john.getAddress().setCity("Ra'anana");
		john.getAddress().setStreet("Ahuza");

		Person jane = new Person(222, "Jane", "Doe");

		Student fred = new Student();
		fred.talk();
		fred.walk();
		fred.learn();
		fred.getAddress().setCity("Holon");

		System.out.println();
		System.out.println("Making everyone walk");

		Person[] people = new Person[3];
		people[0] = john;
		people[1] = jane;
		people[2] = fred;

		for (int i = 0 ; i < people.length ; i++){
			people[i].walk();
		}
		
		Dog rex = new Dog();
		
		Walkable[] walkingThings = new Walkable[2];
		walkingThings[0] = john;
		walkingThings[1] = rex;
		
		for (int i = 0 ; i < walkingThings.length ; i++){
			walkingThings[i].walk();
		}
		
		
	}

}
