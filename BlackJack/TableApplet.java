import java.awt.*;
import java.applet.*;

public class TableApplet extends Applet {

	private Card poster;

	public void init() {
		poster = new Card("Hearts", 1, 1);
	}

	public void paint(Graphics g) {
		poster.draw(g, new Rectangle(50, 50, 200, 300));
	}

}