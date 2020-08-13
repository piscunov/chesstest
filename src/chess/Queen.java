package chess;

public class Queen extends Piece {

	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if((X==destX && Y!=destY)
				|| (Y==destY && X!=destX)
				|| Math.abs(X-destX)==Math.abs(Y-destY)) {
			return checkMiddle(X, Y, destX, destY);
		}
		return false;
	}

}
