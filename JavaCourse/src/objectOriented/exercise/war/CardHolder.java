package objectOriented.exercise.war;

import java.util.ArrayList;
import java.util.List;

public abstract class CardHolder {

	private List<Card> cards;

	public CardHolder() {
		cards = new ArrayList<Card>();
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card getCard() {
		return cards.remove(0);
	}

	public Card getCard(int index) {
		return cards.remove(index);
	}

	public int getNumberOfCards() {
		return cards.size();
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for (Card card: cards){
			sb.append(card).append("\n");
		}
		return sb.toString();
	}

}
