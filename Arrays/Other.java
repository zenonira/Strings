public class Bingo {
	public static void main(String[] args) {
		int [][] a = { {1,2,3,4}
						{5,6,7,8}
						{9,10,11,12}};
		int [] b = {1,2,3,4};
		bingo(a, b);
	}
	public static boolean bingo(int[][] board, int[] drawn) {
		for (int i =0; i<drawn.length; i++) {
			for (int row=0; row<board.length; row++) {
				for (int col=0; col<board[row].length; col++) {
					if (board[row][col] == drawn[i]) {
						board[row][col] = 0;
					}
				}
			}
			if (checkRow(board) == 0) {
				return true;
			}
			if (checkCol(board) == 0) {
				return true;
			};
		}
		return false;
	}

	public static int checkRow(int[][] board) {
		int sum =0;
		for (int r=0; r<board.length; r++) {
			for (int c=0; c<board[r].length; c++) {
				sum += board[r][c];
			}
			if (sum == 0) {
				return 0;
			}
			sum = 0;

		}
		return 1;
	}

	public static int checkCol(int[][] board) {
		int sum = 0;
		int i = 0;
		for (int c=0; c<board[i].length; c++) {
			for (int x=0; x<board.length; x++) {
				sum += board[x][c];
			}
			if (sum == 0) {
				return 0;
			}
			sum = 0;
			i++;
		}
		return 1;

	}

}