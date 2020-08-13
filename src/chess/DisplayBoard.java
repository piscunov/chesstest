package chess;

public class DisplayBoard {

	public static void initialize() {
		
		String board[][] = {
				{"AT1", "AC1", "AN1", "AR1", "AR0", "AN2", "AC2", "AT2"},
				{"AP1", "AP2", "AP3", "AP4", "AP5", "AP6", "AP7", "AP8"},
				{"0", "0", "0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0", "0"},
				{"0", "0", "0", "0", "0", "0", "0", "0"},
				{"BP1", "BP2", "BP3", "BP4", "BP5", "BP6", "BP7", "BP8"},
				{"NT1", "NC1", "NN1", "NR1", "NR0", "NN2", "NC2", "NT2"}
				};
		Board.whiteOnTop = false;
		Board.chessBoard = new String [8][8];
		Board.chessBoard= board;
	}
	
	public static void initialize(String board[][]) {
		Board.chessBoard = new String [8][8];
		Board.chessBoard=board;
		if(Board.chessBoard[0][0].charAt(0)=='A') 
			Board.whiteOnTop = true;
		else
			Board.whiteOnTop = false;
	}
	
	public static void displayBoardState() {
		System.out.println("Tabla dupa mutare:");
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(Board.chessBoard[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	
}
