package chess;

public class Knight extends Piece{
	public Knight(PieceColour p){
		if(p == PieceColour.BLACK){
			setSymbol("♞");
		}

		else if(p == PieceColour.WHITE){
			setSymbol("♘");
		}
		colour = p;
		
		
	}
	public boolean isLegitMove(int a,int b,int c,int d){
		if(Board.hasPiece(c,d)){
			// white
			if((Board.getPiece(a,b).getSymbol() == "♘" && (Board.getPiece(c,d).getColour() == PieceColour.WHITE))){
				return false;
			}
			// black
			if((Board.getPiece(a,b).getSymbol() == "♞" && (Board.getPiece(a,b).getColour() == PieceColour.BLACK))){
				return false;
			}
		}
		if((c==a+2 && d==b+1) || (c==a+2 && d==b-1) || (c==a-2 && d==b+1) || (c==a-2 && d==b-1) ||(c==a+1 && d==b+2)|| (c==a+1 && d==b-2) ||  (c==a-1 && d==b+2) || (c==a-1 && d==b-2) || (c==a+1 && d==b-2))
			return true;
		
		return false;
	}
	

}
	

