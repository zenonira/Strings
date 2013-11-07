import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Card {
	private String suit;
	private int value;
	private String number;
	private Image image;


	public Card(String suit, int value, String number) {
		this.suit = suit;
		this.value = value;
		this.number = number;
		this.image = Card.loadImage(number + suit);
	}

	

	private static Image loadImage(String name) {
		String path = null;
		Image image = null;

		try {
			path = "cards" + File.separator + name + ".png";
			image = ImageIO.read(new File(path));
		} catch(IOException e) {
			System.out.println("Could not load image at path: " + path);
			System.exit(1);
		}

		return image;
	}

	public void draw(Graphics g, Rectangle r) {
	    g.drawImage(image, r.x, r.y, r.width, r.height, null);
	}

	public int getValue() {
		return this.value;
	}

	public void print() {
	    System.out.println(suit + " " + value + " " + number);
	}
}