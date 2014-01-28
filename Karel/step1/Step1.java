/******************************************************************************************
 * 
 * 
 * 	Step 1 
 * 		
 *			
 *		This class represents your robot.  Make changes to the start method, or add
 *		new ones.
 *
 *		Goal
 *			
 *			Make your robot pick up all of the beepers and return home.
 * 
 * 		
 * 		Your robot has been placed on a grid of streets and avenues. The robot is always 
 * 		at an intersection. Beepers may exist at intersections. Walls may impede the 
 * 		progress of your robot. If you run into a wall your robot will shut itself off.
 * 
 * 		Your robot has these abilities (called methods):
 * 
 * 			move() - the robot moves one space in whichever direction it is facing.
 * 			
 * 			turnLeft() - the robot turns left 90 degrees.
 * 
 * 			turnOff() - stops the robot from doing anything else.
 * 
 * 			putBeeper() - places a beeper on the ground.  If the robot has no beepers left 
 * 							it will shut itself off.
 * 
 * 			pickBeeper() - picks up a beeper from the ground. If there are no beepers to
 * 							pick up the robot shuts itself off.
 * 
 * 
 * 		Your robot can also check these things, which give a true or false response
 * 		(these are still called methods, they just give a response):
 * 	
 * 			anyBeepersInBeeperBag() - true if your robot possesses beepers
 * 
 * 			facingEast()  - true if pointed East
 * 			facingWest()  - true if pointed West
 * 			facingNorth() - true if pointed North
 * 			facingSouth() - true if pointed South
 * 			
 * 			frontIsClear() - true if there is no wall immediately next to the robot in the 
 * 								direction in which it is facing
 * 
 * 			nextToABeeper() - true if there is currently a beeper on the same intersection 
 * 								as the robot
 * 			
 * 			nextToARobot() - true if there is another robot on the same corner
 * 
 * 
 ******************************************************************************************/

// includes the necessary files to know what a robot does
import kareltherobot.*;

// starts the definition of a MyRobot object that has all of the functionality
// of a normal robot plus whatever you add here
public class Step1 extends Robot {

	// Constructor
	// 		sets up the Robot based on the code in runner
	//		
	//		do not change
	public Step1(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}
	
	// makes the robot go
	public void start() {
		// TODO robot action code goes here


	}

	// Java always looks for this method to start your program
	// Every program you write should have one and only one
	// method named main
	public static void main(String[] args) {
		World.readWorld("first.kwld");
		World.setVisible(true);
		World.setDelay(30);
		Step1 karel = new Step1(1, 1, Directions.North, 3);
		karel.start();
	}

}
