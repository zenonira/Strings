/******************************************************************************************
 * 
 * 
 * 	Step 3
 *
 *		Goal
 *			
 *			Navigate to the room full of beepers. Pick them all up.
 *			On your way back, place one beeper on each square of the
 *			hallway.
 * 
 * 
 ******************************************************************************************/

// includes the necessary files to know what a robot does
import kareltherobot.*;

// starts the definition of a Step2 object that has all of the functionality
// of a normal robot plus whatever you add here
public class Step3 extends Robot {
	
	// Constructor
	// 		sets up the Robot based on the code in runner
	//		do not change
	public Step3(int street, int avenue, Direction direction, int beepers) {
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
		World.readWorld("BeeperRoom.kwld");
		World.setVisible(true);
		World.setDelay(30);
		Step3 karel = new Step3(1, 1, Directions.East, 0);
		karel.start();
	}

}
