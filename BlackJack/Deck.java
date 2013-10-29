public class Deck {

	private int value;
	private String name;

	public Deck() {
		spades = new Suit();
	}

	public void Suit() {
		Card ace = new Card("ace", 1);
		Card two = new Card("two", 2);
		Card three = new Card("three", 3);
		Card four = new Card("four", 4);
		Card five = new Card("five", 5);
		Card six = new Card("six", 6);
		Card seven = new Card("seven", 7);
		Card eight = new Card("eight", 8);
		Card nine = new Card("nine", 9);
		Card ten = new Card("ten", 10);
		Card jack = new Card("jack", 10);
		Card queen = new Card("queen", 10);
		Card king = new Card("king", 10);
	}