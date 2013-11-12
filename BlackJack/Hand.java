public class Hand {
	
	Card[] thehand = new Card[11];
	//private Deck cards;
	private int totalValue = 0;

	public Hand() {
		for (int i = 0; i < 11; i++) {
			if (totalValue > 21) {
				thehand[i] = null;
			} else {
				thehand[i] = getCard(i);
				totalValue += thehand[i].getValue();
			}
		}
	}

	public Card getCard(int top) {
		return Deck.cards[top];
	}

}