package chess;

import java.io.Console;

public class Game {
	private static boolean gameEnd=false;
	
	public static void play(){
		int white = 1;
		while(!gameEnd){
			boolean wk = false;
			boolean bk = false;
			for (int i=0; i<8; i++){
				for (int j=0; j<8; j++){
					if(Board.hasPiece(i,j)){
						if(Board.getPiece(i,j).getSymbol() == "♔"){
							wk = true;
						}

						if(Board.getPiece(i,j).getSymbol() == "♚"){
							bk = true;
						}
							
					}

				}
					
			}
			if(wk ==false || bk ==false){
				if(wk == false)
					System.out.print("\nGame over, Black wins!\n");
				if(bk == false)
					System.out.print("\nGame over, White wins!\n");

				gameEnd = true;
				continue;
			}
			if(white == 1)
				System.out.print("-----Whites move-----\n");
			if(white == 0)
				System.out.print("-----Blacks move-----\n");



			Console keyboardconsole = System.console();
			String sourceDestination = keyboardconsole.readLine("Enter origin: ");
			String endDestination = keyboardconsole.readLine("Enter destination: ");
			sourceDestination=sourceDestination.toUpperCase();
			endDestination=endDestination.toUpperCase();
			if(sourceDestination.equals("END") || endDestination.equals("END")){
				if(white == 1){
					System.out.print("\nWhite surrenders! Black wins!\n");
				}
				if(white == 0){
					System.out.print("\nBlack surrenders! White wins!\n");
				}
				gameEnd = true;
				continue;
			}
			sourceDestination=sourceDestination.toLowerCase();
			endDestination=endDestination.toLowerCase();

			while((CheckInput.checkCoordinateValidity(sourceDestination) == false || CheckInput.checkCoordinateValidity(endDestination) == false)){
				System.out.println("Invalid input, please try again.\n");
				sourceDestination = keyboardconsole.readLine("Enter origin: ");
				endDestination = keyboardconsole.readLine("Enter destination: ");

			}

			char sourceDestinationCharacter = sourceDestination.charAt(1); 
			int sourceDestinationAscii = (int) sourceDestinationCharacter - 97;
			char endDestinationCharacter = endDestination.charAt(1); 
			int endDestinationAscii = (int) endDestinationCharacter - 97;
	
			if(Board.hasPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii)){
				// WHITES TURN
				if((Board.getPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii).getColour() == PieceColour.WHITE) && (white == 1)){
					if(Board.getPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii).isLegitMove(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii,Integer.parseInt(endDestination.substring(0,1))-1,endDestinationAscii)){
					Board.movePiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii,Integer.parseInt(endDestination.substring(0,1))-1,endDestinationAscii,Board.getPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii));
					Board.printBoard();
					white = 0;
					continue;
				}
				} 
				// BLACKS TURN
				if((Board.getPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii).getColour() == PieceColour.BLACK) && (white == 0)){
					if(Board.getPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii).isLegitMove(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii,Integer.parseInt(endDestination.substring(0,1))-1,endDestinationAscii)){
					Board.movePiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii,Integer.parseInt(endDestination.substring(0,1))-1,endDestinationAscii,Board.getPiece(Integer.parseInt(sourceDestination.substring(0,1))-1,sourceDestinationAscii));
					Board.printBoard();
					white = 1;
					continue;
					}

				}
				}
			System.out.println("Invalid input/destination, please try again.\n");
		}

	}
	public static void main(String[] args) {
		Board.initialiseBoard();
		Board.initialisePieces();
		Board.printBoard();
		Game.play();

	}
}