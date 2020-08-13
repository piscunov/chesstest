package chess;

import java.util.ArrayList;
import java.util.Collection;

public class Pawn extends Piece {

	Collection<PieceType> possibleMoves;
	
	
	public Pawn(char color, String pieceType){
		possibleMoves = new ArrayList<>();
		
	}
	
	@Override
	public boolean validatePiece(int X, int Y, int destX, int destY) {
		if(Board.whiteOnTop) {
			if(this.getColor()=='A' && destX-X<0)
				return false;
			if(this.getColor()=='N' && destX-X>0)
				return false;
		}
		else {
			if(this.getColor()=='A' && destX-X<0)
				return false;
			if(this.getColor()=='N' && destX-X>0)
				return false;
		}
		if(((X==1 || X==6) && (Math.abs(destX-X)==2)) 
				|| ((X!=1 || X!=6) && (Math.abs(destX-X)==1)) 
				&& Y==destY) {
			return true;
		}
		if(Math.abs(Y-destY)==1) {
			if(Board.chessBoard[destX][destY]=="0")
			return true;
		}
		if(Math.abs(X-destX)==1 && Math.abs(Y-destY)==1) {
			return true;
		}
		return false;
	}

	@Override
	public Collection<PieceType> getPossibleMoves() {
		// TODO Auto-generated method stub
		return possibleMoves;
		
	}	
	
	
	//@Override
	//public Collection<PieceType> generatePossibleMoves() {
	//	// TODO Auto-generated method stub
	//	possibleMoves.clear();
	//	boolean color = super.isBlack();
	//	int X = color ? -1 : 1;
	//	
	//	Board board;
	//	
	//	return possibleMoves;
		
		
		
	}


