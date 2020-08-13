package chess;

public class King extends Piece {

	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if(Math.abs(X-destX)==1 || Math.abs(Y-destY)==1)
			return true;
		return false;
	}

}