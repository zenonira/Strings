public class Human extends Player {
	
	private Human human;

	public Human() {
		this.human = new Human();
	}

	public void hit(Dealer dealer) {
		this.addCard(dealer.giveCard());
	}

}