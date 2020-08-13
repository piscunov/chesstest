package chess;

public class Bishop extends Piece{

	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if( Math.abs(X-destX) == Math.abs(Y-destY) ) {
			
		return true;
	}
		return false;
  }
}

