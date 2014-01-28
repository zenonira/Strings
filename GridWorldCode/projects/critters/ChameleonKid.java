public class ChameleonKid extends ChameleonCritter {
	int direction = getDirection();
	ArrayList<Location> list = getOccupiedLocations();
	public void processActors(ArrayList<Actor> actors) {

		for (i = 0; i<=list.length; i++) {
			
		}

	    int n = actors.size();
	    if (n == 0) {
	    	return;
	    }
	    int r = (int) (Math.random() * n);

	    Actor other = actors.get(r);
	    setColor(other.getColor());
	}
}