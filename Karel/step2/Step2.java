/******************************************************************************************
 * 
 * 
 * 	Step 2
 *
 *		Goal
 *			
 *			Make your robot pick up all of the beepers and return home. 
 * 			
 *
 *		Extension
 *			
 *			Use a top-down approach.
 * 
 * 
 ******************************************************************************************/

// includes the necessary files to know what a robot does
import kareltherobot.*;

// starts the definition of a Step2 object that has all of the functionality
// of a normal robot plus whatever you add here
public class Step2 extends Robot {
	
	// Constructor
	// 		sets up the Robot based on the code in runner
	//		do not change
	public Step2(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	// start
	// 		makes the robot go
	public void start() {
		// TODO robot action code goes here
		
	}

	// Java always looks for this method to start your program
	// Every program you write should have one and only one
	// method named main
	public static void main(String[] args) {
		World.readWorld("second.kwld");
		World.setVisible(true);
		World.setDelay(30);
		Step2 karel = new Step2(1, 1, Directions.North, 3);
		karel.start();
	}

}
