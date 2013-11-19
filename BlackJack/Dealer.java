public class Dealer extends Player {
	
	Deck cards;
	private Dealer dealer = new Dealer();

	public Dealer() {

	}

	public Card giveCard() {
		return cards.top();
	}
}