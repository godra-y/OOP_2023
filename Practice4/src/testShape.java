import java.util.Vector;

public class testShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape> shapes=new Vector<>();

	    shapes.add(new Circle(9, Color.RED, 7));
	    shapes.add(new Rectangle(4, Color.GREEN, 6, 3));
	    shapes.add(new Triangle(8, Color.BLUE, 4, 4));

	    for (Shape shape : shapes) {
	    	shape.draw();
	    }
	}
}
