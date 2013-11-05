import java.util.Random;
public class Deck {
	Card[] cards = new Card[52];

    public Deck() {
    	int i = 0;
        for (int x=1; x<=13; x++) {
        	if (x > 10) {
        		i = 10;
        	} else {
        		i = x;
        	}
            Card newCard = new Card("Hearts", i, x);
            cards[x-1] = newCard;
            Card diamond = new Card("Diamonds", i, x);
            cards[x+12] = diamond;
            Card spades = new Card("Spades", i, x);
            cards[x+25] = spades;
            Card clubs = new Card("Clubs", i, x);
            cards[x+38] = clubs;
        }
        shuffle();
    }

    public void shuffle() {
    	Random random = new Random();
        for (int i = cards.length - 1; i > 0; i--) {
            Card a = cards[i];
            int temp = random.nextInt(i);
            cards[i] = cards[temp];
            cards[temp] = a;
        }
    }

    public void print() {
        for (int i = 0; i < 52; i++) {
            cards[i].print();
        }
    }

}