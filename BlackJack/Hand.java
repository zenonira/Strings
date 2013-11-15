public class Hand {
	
	private Card[] theHand;
	private int i;

	public Hand() {
		this.theHand = new Card[11];
	}

	public void add(Card a) {
		this.theHand[i] = a;
		i++;

	}
	


	

}