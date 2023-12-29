package task3;

public abstract class Piece {
	Position position;

    Piece(Position position) {
        this.position = position;
    }

    abstract boolean isLegalMove(Position a, Position b);
}
