package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Queen extends Piece {
	
	Collection<PieceType> possibleMoves;
	Piece piece ;
	
	public Queen(char color, String pieceId) {
		possibleMoves = new ArrayList<>();
	}

	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if((X==destX && Y!=destY)
				|| (Y==destY && X!=destX)
				|| Math.abs(X-destX)==Math.abs(Y-destY)) {
			return checkMiddle(X, Y, destX, destY);
		}
		return false;
	}
	

	@Override
	public Collection<PieceType> getPossibleMoves() {
		// TODO Auto-generated method stub
		return possibleMoves;
	}

	@Override
	public Collection<PieceType> generatePossibleMoves() {
		// TODO Auto-generated method stub
		possibleMoves.clear();
		possibleMoves.addAll(piece.generatePossibleMoves());
		
		return possibleMoves;
		
	}

}
