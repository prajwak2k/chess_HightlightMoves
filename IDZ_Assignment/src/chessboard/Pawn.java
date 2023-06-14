package chessboard;

public interface Pawn {
	static void pawnMoves(String[][]board, int currentRow,int currentCol) {
		String pawns = board[currentRow][currentCol];
		boolean ispawn = pawns.equals("p");
		boolean isWhitePawn = pawns.equals("P");
		//Now Set The Forward Direction for Pawns
		int direction = ispawn ? 1: -1;
		int forwardRow = currentRow+direction;
		if(isValidPosition(forwardRow, currentCol) && board[forwardRow][currentCol].equals("_")) {
			board[forwardRow][currentCol]="*";
		}
		
		 		//Now Set The Double Forward Direction for Pawns

		int doubleForwaodRow = currentRow+(2*direction);
		 if (ispawn && currentRow == 1 && board[doubleForwaodRow][currentCol].equals("-") && board[forwardRow][currentCol].equals("-")) {
	            board[doubleForwaodRow][currentCol] = "*";
		 }
		 else if (isWhitePawn && currentRow == 6 && board[doubleForwaodRow][currentCol].equals("-") && board[forwardRow][currentCol].equals("-")) {
	            board[doubleForwaodRow][currentCol] = "*";
	        }
		 

	        // Highlight the pawn's diagonal captures
	        int[] captureCols = { currentCol - 1, currentCol + 1 };
	        for (int captureCol : captureCols) {
	            int captureRow = currentRow + direction;
	            if (isValidPosition(captureRow, captureCol) && !board[captureRow][captureCol].equals("-")&& isOpponentPiece(board[captureRow][captureCol], pawns)) {
	                board[captureRow][captureCol] = "*";
	            }
	        }
	    }
		
	 public static boolean isValidPosition(int row, int col) {
	        return row >= 0 && row < 8 && col >= 0 && col < 8;
	    }	
	    public static boolean isOpponentPiece(String piece, String currentPawn) {
            return currentPawn.equals("p") && Character.isUpperCase(piece.charAt(0)) ||
                    currentPawn.equals("P") && Character.isLowerCase(piece.charAt(0));
        }
    }
		
	
   
	


