package chess;

public class Rook extends Piece {

	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if(X==destX || Y==destY)
			return checkMiddle(X, Y, destX, destY);
		return false;
	}
}
