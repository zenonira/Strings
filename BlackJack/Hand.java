public class Hand {
	
	protected Card[] theHand;
	protected int numbCards = 0;

	public Hand() {
		this.theHand = new Card[11];
	}

	public void add(Card a) {
		this.theHand[numbCards] = a;
		numbCards++;

	}

	public int getTotal() {
		int sum = 0;
		for (int i=0; i<numbCards; i++) {
			sum += theHand[i].getValue2();
		}
		if (sum > 21) {
			sum = 0;
			for (int i=0; i<numbCards; i++) {
				sum += theHand[i].getValue();
			}
		}
		return sum;
	}
	


	

}