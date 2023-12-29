package task3;

public class Bishop extends Piece{
	Bishop(Position position){
		super(position);
	}
	
	boolean isLegalMove(Position a, Position b) {
		int dRow = Math.abs(a.row - b.row);
        int dColumn = Math.abs(a.column - b.column);
        return dRow == dColumn;
	}
}
