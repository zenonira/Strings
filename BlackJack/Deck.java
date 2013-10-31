import java.util.Random;
public class Deck {

	Card[] cards = new Card[52];
	int timesDrawn = 0;

	public Deck() {
		for (int x=1; x<=13; x++) {
			int i = x;
			if (x>10) {
				i = 10;
			}
			Card hearts = new Card("Heart", i);
			cards[x-1] = hearts;
			
			Card diamond = new Card("Diamond", i);
			cards[x+12] = diamond;
			
			Card spades = new Card("Spades", i);
			cards[x+25] = spades;
			
			Card clubs = new Card("Clubs", i);
			cards[x+38] = clubs;
			
		}
 	
		shuffle();

	}

	public void drawCard() {
		timesDrawn++;
	}

	public void shuffle() {
		for (int i=52; i>=1; i--) {
			Random random = new Random(52);
			int b = random.nextInt(i);
			Card a = cards[i];
			cards[a] = cards[b];
			cards[b] = a;

		}
	}

}