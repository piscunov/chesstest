package chess;

public class PieceType {

	
	public static Piece getPiece(String inputPiece) {
		char color = inputPiece.charAt(0);
		char pieceId = inputPiece.charAt(1);
		}
		
		Piece piece=null;
		switch(pieceId) {
		case 'C':
			piece = new Horse();
			break;	
		case 'T':
			piece = new Rook();
			break;
		case 'r':
			piece = new Queen();
			break;
		case 'P':
			piece = new Pawn();
			break;
		case 'R':
			piece = new King();
			break;
		case 'N':
			piece = new Bishop();
			break;
		default:
			System.out.println("Incorrect piece in input!(C-Cal,T-Tura,r-Regina,P-Pion,N-Nebun,R-Rege)");
		}
		piece.setColor(color);
			
		return piece;
		
	
	}
	
}
