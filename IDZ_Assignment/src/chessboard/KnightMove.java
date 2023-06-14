package chessboard;

public interface KnightMove {
	public static boolean isValidKnightMove(String[][]board,int currentRow, int currentCol, int newRow, int newCol) {
        // Check if the current position contains a knight
        if (!board[currentRow][currentCol].equalsIgnoreCase("n")) {
            return false;
        }

        // Check if the new position is within the board bounds
        if (newRow < 0 || newRow >= 8 || newCol < 0 || newCol >= 8) {
            return false;
        }

        int rowDiff = Math.abs(newRow - currentRow);
        int colDiff = Math.abs(newCol - currentCol);

        // Check if the move is an L-shape (2 squares in one direction and 1 square in the other)
        return (rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2);
    }
	
	public static void HighlightKnight(String[][]board, int currentRow, int currentCol) {
		  for (int row = 0; row < 8; row++) {
	            for (int col = 0; col < 8; col++) {
	                if (isValidKnightMove(board,currentRow, currentCol, row, col)) {
	                    board[row][col] = "*";
	                }
	            }
		  }
	}

}
