import java.util.Random;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class Deck {
	Card[] cards = new Card[52];
    private int i = -1;

    public Deck() {
    	int i = 0;
        for (int x=1; x<=13; x++) {
        	if (x > 10) {
        		i = 10;
        	} else {
        		i = x;
        	}
            Card newCard = new Card("Hearts", i, number(x));
            cards[x-1] = newCard;
            Card diamond = new Card("Diamonds", i, number(x));
            cards[x+12] = diamond;
            Card spades = new Card("Spades", i, number(x));
            cards[x+25] = spades;
            Card clubs = new Card("Clubs", i, number(x));
            cards[x+38] = clubs;
        }
        //shuffle();
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

    public String number(int x) {
        if (x == 1) {
            return "A";
        } else if (x >= 2 && x <= 10){
            return "" + x;
        } else if (x == 11) {
            return "J";
        } else if (x == 12) {
            return "Q";
        } else {
            return "K";
        }
    }

    public void draw(Graphics g, int yOffSet) {
        int xOffset = 50;
        for (int i=0; i<cards.length; i++) {
            cards[i].draw(g,new Rectangle(xOffset, yOffSet, 100, 150));
            xOffset += 15;
        }
    }

    public Card top() {
        i++;
        return cards[i];
        
    }

}