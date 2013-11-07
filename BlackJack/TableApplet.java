import java.awt.*;
import java.applet.*;

public class TableApplet extends Applet {

	private Deck picture;

	public void init() {
		picture = new Deck();

		// for (int i=0; i<53; i++) {
		// 	int n = 0;
		// 	for (int x=0; x< 11; x++) {
		// 		if (x > 10) {
		// 			n = 10;
		// 		} else {
		// 			n = x;
		// 		}
		// 		poster = new Card("Hearts", n, x);
		// 	}
		// }
		
	}

	public void paint(Graphics g) {
		picture.draw(g);
	}

}