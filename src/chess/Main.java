package chess;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Move move = new Move();
		System.out.println("Comenzi: 'Afisare' (Incepe jocul) si  'Muta' pt a muta o piesa: AP1 12 32");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inp = br.readLine();
		if(inp.equals("Board")) {
			String board[][] = new String[8][8];
			for(int i=0;i<8;i++) {
				String row = br.readLine();
				String rowArray[]=row.split(" ");
				if(row.trim()!="")
				for(int j=0;j<8;j++) {
					board[i][j] = rowArray[j];
				}
			}
			DisplayBoard.initialize(board);
			System.out.println();
			System.out.println("Sa inceapa jocul!");
			DisplayBoard.displayBoardState();
		}
		else if(inp.equals("Afisare")) {
			DisplayBoard.initialize();
			System.out.println();
			System.out.println("Inceputul jocului:");
			DisplayBoard.displayBoardState();
		}
		inp=br.readLine();
		if(inp.equals("Muta")){
			while(inp!=null && inp.trim()!="") {
				if(inp.trim().equals(""))
					break;
				inp = br.readLine();
				if(inp.trim().equals(""))
					break;
				String inputMove[]=inp.split(" ");
					move.move(inputMove);
				}
					DisplayBoard.displayBoardState();
			}
		}
	}
		
	


