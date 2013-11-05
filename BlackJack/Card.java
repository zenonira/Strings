public class Card {
	private String suit;
	private int value;


	public Card(String suit, int value) {
		this.suit = suit;
		this.value = value;
	}

	public void print() {
	    System.out.println(suit + " " + value);
	}
}