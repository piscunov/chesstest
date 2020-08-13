package chess;

public class Move {
	
	String piece;
	int X;
	int Y;
	int destX;
	int destY;
	char color;
	char pieceType;
	


	private void initializeValues(String inputMove[]) {
		
		piece = inputMove[0];
		X = Integer.parseInt(""+inputMove[1].charAt(0));
		Y = Integer.parseInt(""+inputMove[1].charAt(1));
		destX = Integer.parseInt(""+inputMove[2].charAt(0));
		destY = Integer.parseInt(""+inputMove[2].charAt(1));
		color = piece.charAt(0);
		pieceType = piece.charAt(1);
		
	}
	

	public void move(String inputMove[]) {
		initializeValues(inputMove);
		Piece pieceObj = PieceType.getPiece(piece);
		boolean check1=pieceObj.validateFirst(X, Y, destX, destY, piece);
		boolean check2=pieceObj.validatePiece(X, Y, destX, destY);
		if(!check1 || !check2)
			System.out.println("Try another combination!");
		if(check1 && check2)
			pieceObj.move(X, Y, destX, destY, piece);
	}
}
