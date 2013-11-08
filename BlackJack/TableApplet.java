import java.awt.*;
import java.applet.*;

public class TableApplet extends Applet {

	private Deck picture;
	private Hand myhand;

	public void init() {
		picture = new Deck();
		myhand = new Hand();
	
		
	}

	public void paint(Graphics g) {
		picture.draw(g,0);
		picture.shuffle();
		picture.draw(g,100);
	}

}