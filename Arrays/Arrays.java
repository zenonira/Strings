public class Arrays {
	public static void main(String[] args) {
		int[] a = {5, 4, 3, 2, 1};
		//doubleIt(a);
		//sum(a);
		largestElement(a);


		/*for (int i = 0; i < data.length; i++) {
			data[i] = 10;
		}
		 
		for (int i=0, j=10; i < data.length; i++, j--) {
			data[i] = j;
		}

		for (int i=0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}*/

	}

	public static int[] doubleIt(int[] a) {
		for (int i=0, j=5; i < a.length; i++, j--) {
			a[i] = j*2;
		}
		printArray(a);
		return a;
	}

	public static int[] largestElement(int[] a) {
		int largest =0;
		int second =0;
		int small = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] >= largest) {
			largest = a[i];	
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < largest) {
			second = a[i];	
			}
			if (a[i] < small) {
				a[i] = small;
			}
		}
		System.out.println("Largest element: " + largest);
		System.out.println("Second largest element " + second);
		return a;
	}

	public static int[] sum(int[] a) {
		int even = 0;
		int odd = 0;
		int all = 0;
		for (int i=0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				even += a[i];
			}
			if (a[i] % 2 == 0) {
				odd += a[i];
			}
			all = even + odd;
			
		}
		System.out.println("Sum of even numbers: " + even);
		System.out.println("Sum of odd numbers: " + odd);
		System.out.println("Sum of all numbers: " + all);
		return a;
	}

	public static void printArray(int[] a) {
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		System.out.println();
	}

}