package chessboard;

class ChessBoard implements HightLight_Moves,KnightMove,BishopMoveHighlighter,Pawn,queenMoves,Kingmoves
{
	public static String[][] borad;
	public String [][] board;
	// To Initialize starting element
	 public  ChessBoard() {
		 board = new String [8][8];
		 
		 initializeBoard("R", 7, 0);
		 initializeBoard("N", 7, 1);
		 initializeBoard("B", 7, 2);
		 initializeBoard("Q", 7, 3);
		 initializeBoard("K", 7, 4);
		 initializeBoard("B", 7, 5);
		 initializeBoard("N", 7, 6);
		 initializeBoard("R", 7, 7);
		 
		 
		for(int i =0; i<8 ;i++) {
			board[6][i]="P";
		}	 
	 }
	 private void initializeBoard(String element, int r ,int c) {
		 for(int r1 =0;r1<6;r1++) {
			 for(int c1=0;c1<8;c1++) {
				 board[r1][c1] ="-";
			 } 
		 }
		 if(isValidPositions(r,c)) {
			 board[r][c] =element;
		 }else {
			 System.out.println("invalid");
		 }
					 
	 }
	 public void  printBoard() {
		 for(int r =0;r<8;r++) {
			 for(int c =0;c<8;c++) {
				 System.out.print(board[r][c]+"    ");
			 }
			 System.out.println();
		 }
	 }
	 
	 // for Moving The Chess Element
	 public void movePiece(int currentRow,int currentCol,int newRow,int newCol) {
		 if(currentRow<0|| currentCol>=8 || currentCol<0||currentCol>=8 || newRow<0||newRow>=8|| newCol<0|| newCol>=8) {
			 System.out.println("invalid Moves");
			 return;
		 }
		 String element =  board[currentRow][currentCol];
		 board[currentRow][currentCol]="_";
		 board[newRow][newCol] =element;
	 }
	 
		
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 private boolean isValidPositions(int r,int c) {
		 return r>=0 && r<8 && c>=0 && c<8;
	 } 
}