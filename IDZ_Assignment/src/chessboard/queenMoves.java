package chessboard;

public interface queenMoves {
 static void queenHighLight(String[][] board, int currentRow, int currentCol,int newRow,int newCol) {
	 
	        // Highlight horizontal moves
	        for (int col = 0; col < 8; col++) {
	            if (col != currentCol) {
	                board[currentRow][col] = "*";
	            }
	        }

	        // Highlight vertical moves
	        for (int row = 0; row < 8; row++) {
	            if (row != currentRow) {
	                board[row][currentCol] = "*";
	            }
	        }
	     // Highlight diagonal moves (top-left to bottom-right)
	        for (int i = 1; currentRow + i < 8 && currentCol + i < 8; i++) {
	            board[currentRow + i][currentCol + i] = "*";
	        }
	        for (int i = 1; currentRow - i >= 0 && currentCol - i >= 0; i++) {
	            board[currentRow - i][currentCol - i] = "*";
	        }

	        // Highlight diagonal moves (top-right to bottom-left)
	        for (int i = 1; currentRow - i >= 0 && currentCol + i < 8; i++) {
	            board[currentRow - i][currentCol + i] = "*";
	        }
	        for (int i = 1; currentRow + i < 8 && currentCol - i >= 0; i++) {
	            board[currentRow + i][currentCol - i] = "*";
	        }
	        
	        // Check if there are any pieces blocking the rook's path
	        if (currentRow == newRow) { // Horizontal move
	            int startCol = Math.min(currentCol, newCol);
	            int endCol = Math.max(currentCol, newCol);
	            for (int col = startCol + 1; col < endCol; col++) {
	                if (!board[currentRow][col].equals("-")) {
	                	
	                    System.out.println("Invaild");
	                }
	            }
	        } else { // Vertical move
	            int startRow = Math.min(currentRow, newRow);
	            int endRow = Math.max(currentRow, newRow);
	            for (int row = startRow + 1; row < endRow; row++) {
	                if (!board[row][currentCol].equals("-")) {
	                	System.out.println("invaild");
	                    
	                }
	               }
	           }
	        
	        
 }
 
 
 public static void canMoveToPosition(String[][] board,int currentRow, int currentCol, int newRow, int newCol) {
    
	 int rowDiff = Math.abs(newRow - currentRow);
     int colDiff = Math.abs(newCol - currentCol);
     if(currentRow == newRow || currentCol == newCol || rowDiff == colDiff) {
    	 queenMoves.queenHighLight(board, currentRow, currentCol,newRow,newCol);
     }else {
    	 System.out.println("invalid Moves");
     }
 }
}
