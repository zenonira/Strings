import java.util.Random;

class Mean {
	private static Random r = new Random(5345);

	public static void main(String[] args) {
		int[] randomArray = makeRandom(1000, 100);
		System.out.println("The average of the array is ");
		System.out.println(mean(randomArray) + ".");

		System.out.print("The average from index 40 to index 45 is ");
		System.out.println(meanOfRange(randomArray, 40, 45));
	}

	//mean of the numbers in a
	public static double mean(int[] a) {
		//write this
		return meanOfRange(a, 0, a.length-1);
	}

	//mean of a from index start to index end inclusive
	public static double meanOfRange(int[] a, int start, int end) {
		//write this
		double rmean = 0.0;
		for (int i = start; i<end; i++) {
			rmean += a[i];
			
		}
		rmean /= (end-start);

		return rmean;

	}

	public static int[] makeRandom(int size, int range) {
		int[] a = new int[size];

		for (int i=0; i<a.length; i++) {
			a[i] = r.nextInt(range + 1);
		}

		return a;
	}	




}