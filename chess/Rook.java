package chess;

public class Rook extends Piece{

	public Rook(PieceColour p){
		if(p == PieceColour.BLACK)
			setSymbol("♜");
			
		else if(p == PieceColour.WHITE)
			setSymbol("♖");
			
		colour = p;

		

		
		

	}
	public boolean isLegitMove(int a, int b, int c, int d){
		if(Board.hasPiece(c,d)){

			if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(c,d).getColour() == PieceColour.WHITE)))
				return false;
			
			if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(c,d).getColour() == PieceColour.BLACK)))
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
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}

					}
					
				}
			}

			if(direction == "down"){
				for (int i = a+1; i<c; i++) {
					if(Board.hasPiece(i,b)){
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(i,b).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(i,b).getColour() == PieceColour.BLACK))){
							return false;
						}
					}
					
				}
			}

			if(direction == "right"){
				for (int i = b+1; i<d; i++) {
					if(Board.hasPiece(a,i)){
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
					}
					
				}
			}

			if(direction == "left"){
				for (int i = b-1; i>d; i--) {
					if(Board.hasPiece(a,i)){
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♜" && (Board.getPiece(a,i).getColour() == PieceColour.WHITE))){
							return false;
						}
						if((Board.getPiece(a,b).getSymbol() == "♖" && (Board.getPiece(a,i).getColour() == PieceColour.BLACK))){
							return false;
						}
					}
					
				}
			}
			return true;
		}
	
		
		return false;
	}
	
}
	


