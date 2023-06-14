package chessboard;

public interface Kingmoves {
	 public static void highlightMoves(String[][] board, int currentRow, int currentCol) {
	        int[][] moves = {
	            {-1, -1}, {-1, 0}, {-1, 1},{0, -1},{0, 1},{1, -1}, {1, 0}, {1, 1}
	        };

	        for (int[] move : moves) {
	            int newRow = currentRow + move[0];
	            int newCol = currentCol + move[1];
	            if (isValidPosition(newRow, newCol)) {
	                board[newRow][newCol] = "*";
	            }
	        }
	
}
	 public static boolean isValidPosition(int row, int col) {
         return row >= 0 && row < 8 && col >= 0 && col < 8;
     }
	    
	    }
