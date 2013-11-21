import java.awt.*;
import java.applet.*;

public class Human extends Player {
	

	public Human() {
		super();
	}

	public void draw(Graphics g) {
		int xOffset = 50;
		for (int i=0; i<numbCards; i++) {
			theHand[i].draw(g, new Rectangle(xOffset, 50, 150, 300));
			xOffset += 50;
		}
	}

}