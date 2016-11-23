package basicJavaUsage.exercise.blackjack;

public class Game {

	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

	private void run() {
		Deck deck = createDeck();
		deck = shuffleDeck(deck);
		int numOfCards = deck.getNumberOfCards();
		Hand hand0 = createHand(deck, numOfCards / 2);
		Hand hand1 = createHand(deck, numOfCards / 2);

		while (hand0.getNumberOfCards() > 0 && hand1.getNumberOfCards() > 0) {
			Card card0 = hand0.getCard();
			Card card1 = hand1.getCard();
			if (card0.getNumber() > card1.getNumber()) {
				System.out.println("Player 0 has the bigger card: " + card0 + " vs " + card1);
				hand0.addCard(card0);
				hand0.addCard(card1);
			} else if (card1.getNumber() > card0.getNumber()) {
				System.out.println("Player 1 has the bigger card: " + card1 + " vs " + card0);
				hand1.addCard(card0);
				hand1.addCard(card1);
			}
			System.out.println(
					"Player 0 has " + hand0.getNumberOfCards() + " cards, player 1 has " + hand1.getNumberOfCards());
		}
		if (hand0.getNumberOfCards() > 0) {
			System.out.println("Player 0 won the game");
		} else {
			System.out.println("Player 1 won the game");
		}

	}

	private Hand createHand(Deck deck, int numOfCards) {
		Hand hand = new Hand();
		for (int i = 0; i < numOfCards; i++) {
			int index = (int)(Math.random() * deck.getNumberOfCards()); 
			hand.addCard(deck.getCard(index));
		}
		return hand;
	}

	private Deck shuffleDeck(Deck deck) {
		Deck shuffledDeck = new Deck();
		while (deck.getNumberOfCards() > 0) {
			int index = (int) (Math.random() * (deck.getNumberOfCards() - 1));
			shuffledDeck.addCard(deck.getCard(index));
		}
		return shuffledDeck;
	}

	private Deck createDeck() {
		Deck deck = new Deck();
		for (Suit suit : Suit.values()) {
			for (int i = 1; i <= 13; i++) {
				Card card = new Card(i, suit);
				deck.addCard(card);
			}
		}
		return deck;
	}
}
