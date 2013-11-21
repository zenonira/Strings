import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class TableApplet extends Applet implements ActionListener{

	Deck myDeck = new Deck();
	Human human = new Human();
	Dealer dealer = new Dealer();
	private JButton hit, stay, newGame;
	private String answer;


	public void init() {
		String title = "Hit";
		hit = new JButton(title);
		hit.setActionCommand(title);
		hit.addActionListener(this);
		this.add(hit);

		title = "Stay";
		stay = new JButton(title);
		stay.setActionCommand(title);
		stay.addActionListener(this);
		this.add(stay);

		title = "New Game";
		newGame = new JButton(title);
		newGame.setActionCommand(title);
		newGame.addActionListener(this);
		this.add(newGame);


		myDeck.shuffle();
		human.add(myDeck.top());
		dealer.add(myDeck.top());
		human.add(myDeck.top());
		dealer.add(myDeck.top());


	
		
	}

	public void actionPerformed(ActionEvent ae) {
		if ("Hit".equals(ae.getActionCommand())) {
			if (human.getTotal() <= 21) {
				human.add(myDeck.top());
				answer = "";
				checkAnswer();
			} else {
				answer = "You Busted";
			}
			repaint();
		} else if ("Stay".equals(ae.getActionCommand())) {
			if (dealer.getTotal() < 17) {
				dealer.add(myDeck.top());
			} else {
				if ((human.getTotal() > dealer.getTotal() || dealer.getTotal() > 21) && human.getTotal() < 22) {
					answer = "You Win";
				} else if (human.getTotal() < dealer.getTotal() && dealer.getTotal() < 22 || human.getTotal() > 21) {
					answer = "You Lose";
				} else {
					answer = "It's A Draw";
				}
			}
			repaint();
		}
		if ("New Game".equals(ae.getActionCommand())) {
			init();
			repaint();
		}
	}

	public void checkAnswer() {
		if (human.getTotal() > 21) {
			answer = "You Busted";
		} else {
			answer = "";
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		human.draw(g);
		dealer.draw(g);
		g.drawString("" + human.getTotal(), 25, 25);
		g.drawString("" + dealer.getTotal(), 25, 50);
		g.drawString(answer, 100, 400);
	}

}