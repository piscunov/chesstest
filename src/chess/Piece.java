package chess;

import java.util.Collection;

public abstract class Piece {

private char color;
private String pieceId;

	
	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}
	
	public boolean isBlack() {
		return true;
	}
	
	public abstract boolean validatePiece(int X, int Y, int destX, int destY);
	
	public void move(int X, int Y, int destX, int destY, String piece) {
		Board.chessBoard[destX][destY]=piece;
		Board.chessBoard[X][Y]="0";
	}
	
	public boolean checkMiddle(int X, int Y, int destX, int destY) {
		if(X==destX && Y!=destY) {
			for(int i=Y+1;i<destY;i++) {
				if(Board.chessBoard[destX][i]!="0")
					return false;
			}
		}
		else if(X!=destX && Y==destY) {
			for(int i=X+1;i<destX;i++) {
				if(Board.chessBoard[i][destY]!="0")
					return false;
			}
		}
		else if(Math.abs(X-destX)==Math.abs(Y-destY)) {
			for(int i=X+1,j=Y+1;i<destX && j<destY;i++,j++) {
				if(Board.chessBoard[i][destY]!="0")
					return false;
			}
		}
		return true;
	}
	
	public boolean validateFirst(int X, int Y, int destX, int destY, String piece) {
		char color = piece.charAt(0);
		if(X>=8 || destX>=8 || Y>=8 || destY>=8) {
			System.out.println("Exception handled!");
			return false;
		}
		if(Board.chessBoard[X][Y].equals("0")) {
			System.out.println(" No piece in there!");
			return false;
		}
		if(!Board.chessBoard[X][Y].equals(piece)) {
			System.out.println("Invalid move, different piece at given source!");
			return false;
		}
		if(Board.chessBoard[destX][destY]!="--") {
			if(Board.chessBoard[destX][destY].charAt(0)==color) {
				System.out.println("Your color piece is at that place!");
				return false;
			}
		}
		return true;
	}
	
	public abstract Collection<PieceType> getPossibleMoves();

	public abstract Collection<PieceType> generatePossibleMoves();
	
	public boolean isOpponent(Piece piece) {
		return piece != null &&  getColor() != piece.getColor();
	}
	
	
	
	public void printPossibleMoves(String pieceId, Move moves) {
		generatePossibleMoves();
		getPossibleMoves().stream().forEach((_item) -> {
			if(isOpponent(_item.getPiece(pieceId))) {
				moves.color = 'I'; // Inamic
				
			}
			else {
				moves.color = 'F';//Familie
			}
		});
	}
	
	
}
