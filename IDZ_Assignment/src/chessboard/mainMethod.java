package chessboard;

public class mainMethod {
	public static void main(String[] args) {
		ChessBoard moves = new ChessBoard();
		moves.printBoard();
		
		
//		 moves.movePiece(6,0,3,3); System.out.println("/After Moving element");
//		 moves.printBoard();
		 
		
		
		System.out.println("--------------------------------------------");
		 
			//HightLight_Moves.highlightPossibleMoves(moves.board,3, 3);
			//moves.printBoard();
		
		//KnightMove.HighlightKnight(moves.board, 7, 1);
		//moves.printBoard();
		
//		Pawn.pawnMoves(moves.board, 6, 1);
//		moves.printBoard();
	      
		//BishopMoveHighlighter.canMoveToPosition(moves.board, 7, 3, 5, 3);
		//moves.printBoard();
		
		queenMoves.canMoveToPosition(moves.board, 7, 3, 5, 3);
		moves.printBoard();
		
		//Kingmoves.highlightMoves(moves.board, 3, 3);
		//moves.printBoard();
		
		
		
		
		
	      
	}

}
