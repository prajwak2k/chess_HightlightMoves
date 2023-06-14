package chessboard;



 interface BishopMoveHighlighter  { 
		  static void highlightBishopMoves(String[][] board, int row, int col) {
		        // Highlight diagonal moves (top-left to bottom-right)
		        for (int i = 1; row + i < 8 && col + i < 8; i++) {
		            board[row + i][col + i] = "*";
		        }
		        for (int i = 1; row - i >= 0 && col - i >= 0; i++) {
		            board[row - i][col - i] = "*";
		        }

		        // Highlight diagonal moves (top-right to bottom-left)
		        for (int i = 1; row - i >= 0 && col + i < 8; i++) {
		            board[row - i][col + i] = "*";
		        }
		        for (int i = 1; row + i < 8 && col - i >= 0; i++) {
		            board[row + i][col - i] = "*";
		        }
		    }
		   public static void canMoveToPosition( String[][] board,int currentRow, int currentCol, int newRow, int newCol) {
		        int rowDiff = Math.abs(newRow - currentRow);
		        int colDiff = Math.abs(newCol - currentCol);
		        if( rowDiff == colDiff) {
		        	BishopMoveHighlighter.highlightBishopMoves(board, currentRow, currentCol);
		        	
		        }else {
		        	System.out.println("invalid ");
		        }
		    }
		}
 

 
 
	 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
