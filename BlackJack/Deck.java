public class Deck {

	Card[] cards = new Card[52];

	public Deck() {
		for (int x=1; x<=13; x++) {
			Card newCard = new Card("heart", x);
			cards[x-1] = newCard;
			Card diamond = new Card("Diamond", x);
			cards[x+12] = diamond;
			Card spades = new Card("Spades", x);
			cards[x+25] = spades;
			Card clubs = new Card("Clubs", x);
			cards[x+38] = clubs;
		}
	}

}