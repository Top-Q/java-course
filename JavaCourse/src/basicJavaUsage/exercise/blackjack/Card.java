package basicJavaUsage.exercise.blackjack;

public class Card {

	private final int number;

	private final Suit suit;

	public Card(int number, Suit suit) {
		super();
		this.number = number;
		this.suit = suit;
	}

	public int getNumber() {
		return number;
	}

	public Suit getSuit() {
		return suit;
	}

	public String toString() {
		return number + " of " + suit;
	}

}
