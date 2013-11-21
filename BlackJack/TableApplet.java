import java.awt.*;
import java.applet.*;

public class TableApplet extends Applet {

	Deck mydeck = new Deck();
	Human human = new Human();
	Dealer dealer = new Dealer();


	public void init() {
		mydeck.shuffle();
		human.add(mydeck.top());
		dealer.add(mydeck.top());
		human.add(mydeck.top());
		dealer.add(mydeck.top());
	
		
	}

	public void paint(Graphics g) {
		super.paint(g);
		human.draw(g);
		dealer.draw(g);
		g.drawString("" + human.getTotal(), 25, 25);
		g.drawString("" + dealer.getTotal(), 25, 50);
	}

}