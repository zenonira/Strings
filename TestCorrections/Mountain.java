public class Mountain {
	public static boolean isIncreasing(int[] array, int stop) {

	}

	public static boolean isDeceasing(int[] array, int start) {

	}

	public static int getPeakIndex(int[] array) {
		int a=0;
		for (int i=1; i<array.length-1; i++) {
			if (array[i] > array[i-1] && array[i] > array[i+1]) {
				a=i;
				return a;
			} else {
				a=-1;
			}
		}
		return a;
	}

	public static boolean isMountain(int[] array) {
		int peak = getPeakIndex(array);
		return (peak != -1) && isIncreasing(array, peak) && isDecreasing(array, peak);
	}
}