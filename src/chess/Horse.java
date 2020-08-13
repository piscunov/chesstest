package chess;

public class Horse extends Piece {

	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if(Math.abs(X-destX)==2 && Math.abs(Y-destY)==1) {
			return true;
		}
		else if(Math.abs(Y-destY)==2 && Math.abs(X-destX)==1) {
			return true;
		}
		return false;
	}

}