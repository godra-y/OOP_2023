package task3;

public class testPiece {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Rook rook = new Rook(new Position(1, 1));
        King king = new King(new Position(4, 4));
        Bishop bishop = new Bishop(new Position(2, 2));

        Position a = new Position(1, 5);
        Position b = new Position(5, 5);

        if (rook.isLegalMove(a, b)) {
            System.out.println("Rook can move from A to B");
        } 
        else {
            System.out.println("Rook cannot move from A to B");
        }

        if (king.isLegalMove(a, b)) {
            System.out.println("King can move from A to B");
        } 
        else {
            System.out.println("King cannot move from A to B");
        }
        
        if (bishop.isLegalMove(a, b)) {
            System.out.println("Bishop can move from A to B");
        } 
        else {
            System.out.println("Bishop cannot move from A to B");
        }
        
	}

}
