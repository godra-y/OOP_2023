package task3;

public class Rook extends Piece{
	Rook(Position position) {
        super(position);
    }

    boolean isLegalMove(Position a, Position b) {
        return a.row == b.row || a.column == b.column;
    }
}
