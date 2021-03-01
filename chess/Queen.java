package chess;

public class Queen extends Piece{
	public Queen(PieceColour p){
		if(p == PieceColour.BLACK){
			setSymbol("♛");
		}
		else if(p == PieceColour.WHITE){
			setSymbol("♕");
		}
		colour = p;
		
	}
public boolean isLegitMove(int a, int b, int c, int d){
		if(Board.hasPiece(c,d)){

			if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(c,d).getColour() == PieceColour.WHITE)))
				return false;
			
			if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(c,d).getColour() == PieceColour.BLACK)))
				return false;
			
		}
		String direction = "x";
		if(c>a)
			direction = "down";
		if(c<a)
			direction = "up";
		if(d>b)
			direction = "right";
		if(d<b)
			direction = "left";

		if((c<=7 && c>=0 && d==b) || (d<=7 && d>=0) && c==a){
			if(direction == "up"){
				for (int i = a-1; i>c; i--) {
					if(Board.hasPiece(i,b)){
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}

					}
					
				}
			}

			if(direction == "down"){
				for (int i = a+1; i<c; i++) {
					if(Board.hasPiece(i,b)){
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}
					}
					
				}
			}

			if(direction == "right"){
				for (int i = b+1; i<d; i++) {
					if(Board.hasPiece(a,i)){
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
					}
					
				}
			}

			if(direction == "left"){
				for (int i = b-1; i>d; i--) {
					if(Board.hasPiece(a,i)){
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
					}
					
				}
			}
			return true;
		}
		if(Board.hasPiece(c,d)){
			// white
			if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(c,d).getSymbol() == "♖" ||
				Board.getPiece(c,d).getSymbol() == "♔" ||
				Board.getPiece(c,d).getSymbol() == "♕" ||
				Board.getPiece(c,d).getSymbol() == "♗" ||
				Board.getPiece(c,d).getSymbol() == "♘" ||
				Board.getPiece(c,d).getSymbol() == "♙")))
				return false;
			
			// black
			if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(c,d).getSymbol() == "♚" ||
				Board.getPiece(c,d).getSymbol() == "♛" ||
				Board.getPiece(c,d).getSymbol() == "♜" ||
				Board.getPiece(c,d).getSymbol() == "♝" ||
				Board.getPiece(c,d).getSymbol() == "♞" ||
				Board.getPiece(c,d).getSymbol() == "♟")))
				return false;
		}


		for(int i = 0; i<=7;i++){
			if(c==a-i && d==b+i){
				int z = b;
				for (int j = a-1;j>c;j-- ) {
					z +=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}
					
				}



			}

			if(c==a+i && d==b+i){
				int z = b;
				for (int j = a+1;j<c;j++ ) {
					z +=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}					
				}



			}

			if(c==a+i && d==b-i){
				int z = b;
				for (int j = a+1;j<c;j++ ) {
					z -=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}
					
				}



			}

			if(c==a-i && d==b-i){
				int z = b;
				for (int j = a-1;j>c;j-- ) {
					z -=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♛" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♕" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}
					
				}



			}
			if(c==a+i && d==b+i)
				return true;
			if(c==a-i && d==b-i)
				return true;
			if(c==a+i && d==b-i)
				return true;
			if(c==a-i && d==b+i)
				return true;

		
		
		}

	
		
		return false;
	}
	
}
	



	
