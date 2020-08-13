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

	
	/* 
	 * PSEUDOCOD:
	 * crearea unei Colectii de tipul PieceType care salveaza posibilele mutari
	 * array[][] care zice cum se deplaseaza calul pe matrice : 
	 * {-2 ; 1},
	 * {-1, 2},
	 * {1, 2},
	 * {2, 1},
	 * {2, -1},
	 * {1, -2},
	 * {-2, -1}
	 * 
	 * pentru fiecare prima patratica din jur, putem sa mergem 2 in lateral ( forma de L)
	 * daca locul matricii unde dorim este liber conform miscarii calului sau exista un inamic 
	 *  rezulta possibleMoves.add
	 *  
	 *	else 
	 *	throw new Exception ("Nu poti muta");
	 *
	 *returneaza possibilele mutari;
	 *
	 */
	
}