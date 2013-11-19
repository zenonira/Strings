public class Player extends Hand{
	
	private Hand playerHand;

	public Player() {
		this.playerHand = new Hand();
	}

	public void addCard(Card a) {
		this.playerHand.add(a);
	}

	
	
	
}