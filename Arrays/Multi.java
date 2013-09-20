class Multi {
	public static void main(String[] args) {
		int [][] a = { {1, 2, 3, 4, 5},
					{6, 7, 8, 9, 10},
					{11, 12, 13, 14, 15} };

		int [] b = {1,2,3,4,5,6};
		print(rectangularize(b, 3, 2));
	}

	public static void print(int[][] a) {
		for (int r=0; r<a.length; r++) {
			for (int c=0; c<a[r].length; c++) {
				System.out.print(a[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static int [][] rectangularize(int[] a, int rows, int cols) {
		int [][] result = new int[rows][cols];

		int counter = 0;
		for (int i = 0; i < result.length; i++) {
			for (int j=0; j<result[i].length; j++) {
				result[i][j] = a[counter];
				counter++;
			}
			
		}
		return result;
	}
}