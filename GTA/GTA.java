public class GTA {
	
	private String name;
	private double stamina;
	private int health;
	private int count = 0;

	public Person(String name) {
		this(name, 0.5, 100);
		
	}

	public Person(String name, double stamina) {
		setName(name, stamina, 100);
	}
	public Person(String name, double stamina, int health) {
		setName(name);
		this.stamina = stamina;
		this.health = health;
		Person.addOne();

	}

	public String name() {
		return this.name;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Alice");
		Person p2 = new Person("Bob", 0.25);
		Person p3 = new Person("Ryan", 0.99, 30);
	}

	public static addOne() {
		count++;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {

	}

	public void run(int x) {
		// runs x feet
		run(30);
	}

}