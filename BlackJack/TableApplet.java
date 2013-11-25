import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class TableApplet extends Applet implements ActionListener{

	Deck myDeck = new Deck();
	Human human = new Human();
	Dealer dealer = new Dealer();
	private JLabel label;
	private JButton hit, stay, newGame, bet;
	private String answer;
	private int humanWallet = 1000;
	// private int dealerWallet = 99999999;
	private int pot = 0;


	public void init() {
		label = new JLabel("You have $" + humanWallet + " the pot is $" + pot);
		label.setFont(new Font("Sansserif", Font.BOLD, 32));
		this.add(label);

		String title = "Bet $10";
		bet = new JButton(title);
		bet.setActionCommand(title);
		bet.addActionListener(this);
		this.add(bet);


		title = "Hit";
		hit = new JButton(title);
		hit.setActionCommand(title);
		hit.addActionListener(this);
		this.add(hit);

		title = "Stay";
		stay = new JButton(title);
		stay.setActionCommand(title);
		stay.addActionListener(this);
		this.add(stay);

		title = "Next Hand";
		newGame = new JButton(title);
		newGame.setActionCommand(title);
		newGame.addActionListener(this);
		this.add(newGame);
		
		game();


	
		
	}

	public void actionPerformed(ActionEvent ae) {
		if ("Bet $10".equals(ae.getActionCommand())) {
			humanWallet -= 10;
			pot += 20;
			repaint();
		}
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
			for (int i=0; i<11; i++) {
				if (dealer.getTotal() <= 17) {
					dealer.add(myDeck.top());	
				}
			}
			if ((human.getTotal() > dealer.getTotal() || dealer.getTotal() > 21) && human.getTotal() < 22) {
				answer = "You Win";
				humanWallet += pot;
			} else if (human.getTotal() < dealer.getTotal() && dealer.getTotal() < 22 || human.getTotal() > 21) {
				answer = "You Lose";
			} else {
				answer = "It's A Draw";
				humanWallet += pot/2;
			}
			repaint();
		}
		if ("Next Hand".equals(ae.getActionCommand())) {
			answer = "";
			game();
			pot = 0;
			repaint();
		}
	}

	public void game() {
		Deck newDeck = new Deck();
		Human newHuman = new Human();
		Dealer newDealer = new Dealer();
		myDeck = newDeck;
		human = newHuman;
		dealer = newDealer;
		myDeck.shuffle();
		human.add(myDeck.top());
		dealer.add(myDeck.top());
		human.add(myDeck.top());
		dealer.add(myDeck.top());
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
		g.drawString("" + answer, 600, 300);
	}

}