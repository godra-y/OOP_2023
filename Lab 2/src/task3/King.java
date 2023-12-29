package task3;

public class King extends Piece{
	King(Position position) {
        super(position);
    }
	
    boolean isLegalMove(Position a, Position b) {
        int dRow = Math.abs(a.row - b.row);
        int dColumn = Math.abs(a.column - b.column);
        return dRow <= 1 && dColumn <= 1;
    }
}
