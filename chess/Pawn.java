package chess;

public class Pawn extends Piece{
	public Pawn(PieceColour p){
		if(p == PieceColour.BLACK){
			setSymbol("♟");
		}
		else if(p == PieceColour.WHITE){
			setSymbol("♙");
		}
		colour = p;
	
	

	}
	public boolean isLegitMove(int a,int b,int c,int d){
		if(Board.hasPiece(c,d)){
			// white
			if((c==a-1 && b==d && (Board.getPiece(c,d).getColour() == PieceColour.WHITE))){
				return false;
			}
			// black
			if((c==a+1 && b==d && (Board.getPiece(c,d).getColour() == PieceColour.BLACK))){
				return false;
			}
		}

		if((a == 6 && c==a-2 && b == d  && Board.getPiece(a,b).getSymbol() == "♙") || (a == 1 && c==a+2 && b == d&& Board.getPiece(a,b).getSymbol() == "♟")){
			if(Board.hasPiece(c,d))
				return false;
			else
				return true;
		}
		if((c == a-1 && b == d  && Board.getPiece(a,b).getSymbol() == "♙") || (c == a+1 && b == d&& Board.getPiece(a,b).getSymbol() == "♟")){
			if(Board.hasPiece(c,d))
				return false;
			else
				return true;
		}
		if(Board.hasPiece(c,d)){
			if((c == a-1 && (d == b-1 ||d==b+1)  && Board.getPiece(a,b).getSymbol() == "♙"  && (Board.getPiece(c,d).getColour() == PieceColour.BLACK)) || (c == a+1 && (d == b+1||d==b-1) &&
				Board.getPiece(a,b).getSymbol() == "♟" && (Board.getPiece(c,d).getColour() == PieceColour.WHITE)))
				return true;
		}
		
		return false;
	}
	

}