package chess;

public class Bishop extends Piece{
	public Bishop(PieceColour p){
		if(p == PieceColour.BLACK){
			setSymbol("♝");
		}

		else if(p == PieceColour.WHITE){
			setSymbol("♗");
		}
		colour = p;
		
	}
	public boolean isLegitMove(int a,int b,int c,int d){
		if(Board.hasPiece(c,d)){
			// white
			if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(c,d).getColour() == PieceColour.WHITE)))
				return false;
			
			// black
			if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(c,d).getColour() == PieceColour.BLACK)))
				return false;
		}


		for(int i = 0; i<=7;i++){
			if(c==a-i && d==b+i){
				int z = b;
				for (int j = a-1;j>c;j-- ) {
					z +=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}
					
				}



			}

			if(c==a+i && d==b+i){
				int z = b;
				for (int j = a+1;j<c;j++ ) {
					z +=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}					
				}



			}

			if(c==a+i && d==b-i){
				int z = b;
				for (int j = a+1;j<c;j++ ) {
					z -=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;

					}
					
				}



			}

			if(c==a-i && d==b-i){
				int z = b;
				for (int j = a-1;j>c;j-- ) {
					z -=1;
					if(Board.hasPiece(j,z)){
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♝" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
							return false;
						if((Board.getPiece(a,b).getSymbol() == "♗" && (Board.getPiece(j,z).getColour() == PieceColour.BLACK)))
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
	

