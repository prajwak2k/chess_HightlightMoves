package chessboard;

public interface HightLight_Moves { 
	public static boolean isValidRookMove(String[][] board,int currentRow, int currentCol, int newRow, int newCol) {
        // Check if the current position contains a rook
        if (!board[currentRow][currentCol].equalsIgnoreCase("R")) {
            return false;
        }

        // Check if the new position is within the board bounds
        if (newRow < 0 || newRow >= 8 || newCol < 0 || newCol >= 8) {
            return false;
        }

        // Check if the rook is moving horizontally or vertically
        if (currentRow != newRow && currentCol != newCol) {
        	   return false;
        }

        // Check if there are any pieces blocking the rook's path
        if (currentRow == newRow) { // Horizontal move
            int startCol = Math.min(currentCol, newCol);
            int endCol = Math.max(currentCol, newCol);
            for (int col = startCol + 1; col < endCol; col++) {
                if (!board[currentRow][col].equals("-")) {
                	
                    return false;
                }
            }
        } else { // Vertical move
            int startRow = Math.min(currentRow, newRow);
            int endRow = Math.max(currentRow, newRow);
            for (int row = startRow + 1; row < endRow; row++) {
                if (!board[row][currentCol].equals("-")) {
                	
                    return false;
                }
               }
           }

           return true;
       }
	 public static  void highlightPossibleMoves(String[][] board,int currentRow, int currentCol) {
	        for (int row = 0; row < 8; row++) {
	            for (int col = 0; col < 8; col++) {
	                if (isValidRookMove(board,currentRow, currentCol, row, col)) {
	                   board[row][col] = "*" ;
	                   
	                }
	            }
	        }
	 }

}
