import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class TableApplet extends Applet implements ActionListener{

	Deck myDeck = new Deck();
	Human human = new Human();
	Dealer dealer = new Dealer();
	private JLabel label;
	private JButton hit, stay, newGame, bet, start, doubleDown;
	private String answer = "";
	private int humanWallet = 1000;
	private int pot = 0;
	private int win = 0;
	private int lose = 0;
	private int tie = 0;
	private boolean cheat = false;

	//makes Label and Buttons
	public void init() {
		label = new JLabel("You have $" + humanWallet + " the pot is $" + pot);
		label.setFont(new Font("Sansserif", Font.BOLD, 32));
		this.add(label);

		String title = "Bet $10";
		bet = new JButton(title);
		bet.setActionCommand(title);
		bet.addActionListener(this);
		this.add(bet);

		title = "Start";
		start = new JButton(title);
		start.setActionCommand(title);
		start.addActionListener(this);
		this.add(start);

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

		title = "Double Down";
		doubleDown = new JButton(title);
		doubleDown.setActionCommand(title);
		doubleDown.addActionListener(this);
		this.add(doubleDown);

		title = "Next Hand";
		newGame = new JButton(title);
		newGame.setActionCommand(title);
		newGame.addActionListener(this);
		this.add(newGame);
		
		game();
		bet.setEnabled(true);
		stay.setEnabled(false);
		newGame.setEnabled(false);	
		doubleDown.setEnabled(false);
		start.setEnabled(false);	
		hit.setEnabled(false);


	
		
	}
	//What happens when buttons are pressed
	public void actionPerformed(ActionEvent ae) {
		if ("Hit".equals(ae.getActionCommand())) {
			hit();
		} else if ("Stay".equals(ae.getActionCommand())) {
			stay();
		}
		if ("Bet $10".equals(ae.getActionCommand())) {
			humanWallet -= 10;
			pot += 20;
			label.setText("You have $" + humanWallet + " the pot is $" + pot);
			repaint();
			start.setEnabled(true);
		}
		if ("Start".equals(ae.getActionCommand())) {
			human.numbFaceDownCards = 0;
			dealer.numbFaceDownCards = 1;
			bet.setEnabled(false);
			hit.setEnabled(true);
			stay.setEnabled(true);
			doubleDown.setEnabled(true);
			start.setEnabled(false);
			repaint();
		}
		if ("Next Hand".equals(ae.getActionCommand())) {
			answer = "";
			game();
			pot = 0;
			label.setText("You have $" + humanWallet + " the pot is $" + pot);
			repaint();
			bet.setEnabled(true);
			stay.setEnabled(false);
			newGame.setEnabled(false);	
			doubleDown.setEnabled(false);
			start.setEnabled(false);	
			hit.setEnabled(false);	
		}
		if ("Double Down".equals(ae.getActionCommand())) {
			humanWallet -= pot/2;
			pot += pot;
			hit();
			stay();
			repaint();
			label.setText("You have $" + humanWallet + " the pot is $" + pot);
		}
	}
	//create each game
	public void game() {
		Deck newDeck = new Deck();
		Human newHuman = new Human();
		Dealer newDealer = new Dealer();
		myDeck = newDeck;
		human = newHuman;
		dealer = newDealer;
		myDeck.shuffle();
		//below is used for back of the cards
		human.numbFaceDownCards = 2;
		dealer.numbFaceDownCards = 2;
		human.add(myDeck.top());
		dealer.add(myDeck.top());
		human.add(myDeck.top());
		dealer.add(myDeck.top());
		//If you get below $-1000 you probably need some help
		//Easter Egg
		if (humanWallet < -1000) {
			cheat = true;
		}
	}

	public void checkAnswer() {
		if (human.getTotal() > 21) {
			answer = "You Busted";
			newGame.setEnabled(true);
			stay.setEnabled(false);
			dealer.numbFaceDownCards = 0;
			lose++;

		} else {
			answer = "";
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		human.draw(g);
		dealer.draw(g);
		if (cheat == true) {
			g.drawString("" + human.getTotal(), 25, 25);
			g.drawString("" + dealer.getTotal(), 25, 50);
		}
		g.drawString("Player", 50, 360);
		g.drawString("Dealer", 50, 710);
		g.drawString("" + win + " - " + lose + " - " + tie, 600, 750);
		g.drawString("" + answer, 600, 300);
		if (humanWallet < 0) {
			g.drawString("Warning You Are Negative", 600, 770);
		}
	}

	public void hit() {
		doubleDown.setEnabled(false);
		if (human.getTotal() <= 21) {
			human.add(myDeck.top());
			answer = "";
			checkAnswer();
		} else {
			checkAnswer();
		}
		repaint();
	}

	public void stay() {
		doubleDown.setEnabled(false);
		for (int i=0; i<11; i++) {
			if (dealer.getTotal() <= 17 && human.getTotal() < 22) {
				dealer.add(myDeck.top());	
			}
		}
		if ((human.getTotal() > dealer.getTotal() || dealer.getTotal() > 21) && human.getTotal() < 22) {
			answer = "You Win";
			win++;
			humanWallet += pot;
		} else if (human.getTotal() < dealer.getTotal() && dealer.getTotal() < 22 || human.getTotal() > 21) {
			answer = "You Lose";
			lose++;
		} else {
			answer = "It's A Draw";
			tie++;
			humanWallet += pot/2;
		}
		dealer.numbFaceDownCards = 0;
		repaint();
		hit.setEnabled(false);
		newGame.setEnabled(true);
	}

}