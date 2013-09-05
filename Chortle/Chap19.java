import java.util.Scanner;

public class Chap19 {
	public static void main(String[] args) {
		drugPot();
		hailstone();
		
	}

	public static void drugPot() {
		double x = 100.00;
		double percent = .04;
		double num;
		int month = 0;
		while (x >= 50.00) {
			System.out.print("month: " + month);
			System.out.println("     effectiveness: " + x);
			num = x*percent;
			x = x - num;
			month++;
			if (x < 50) {
				System.out.print("month: " + month);
				System.out.println("     effectiveness " + x + " DISCARD");
			}
		}
	}

	public static void hailstone() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = reader.nextInt();
		while (n != 1) {
			if (n%2 == 1) {
				n = n*3 +1;
				System.out.println(n);
			}
			if (n%2 == 0) {
				n = n/2;
				System.out.println(n);
			}
		}
	}

	public static void excersise5() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number: ");
		
	}
}