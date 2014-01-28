public class FarmRunner {

	public static void main(String[] args) {
		// Cow cow = new Cow();
		// Chicken chicken = new Chicken();
		// Duck duck = new Duck();
		// Pig pig = new Pig();
		// Sheep sheep = new Sheep();

		// Animal[] animals = {cow, chicken, duck, pig, sheep};
		Animal[] animals = new Animal[5];
		animals[0] = new Cow();
		animals[1] = new Chicken();
		animals[2] = new Duck();
		animals[3] = new Pig();
		animals[4] = new Sheep();
		for (int i=0; i<animals.length; i++) {
			animals[i].speak();
		}
	}
}