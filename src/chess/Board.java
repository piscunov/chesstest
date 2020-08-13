package chess;

public class Board {
	private  int i;
	private  int j;

	public static String chessBoard[][];
	
	public static  boolean whiteOnTop = false;
	
	public void piecePosition(int i, int j) {
		if(i < 0 || i>= Board.chessBoard.length || j < 0 || j >= Board.chessBoard.length) {
			throw new IllegalArgumentException("Invalid position");
		}
		this.i = i;
		this.j = j;
	}
	

}


