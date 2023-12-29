package task1a;

import java.util.Vector;

public class testShape3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Shape3D> shapes = new Vector<>();
		
		shapes.add(new Cylinder(3, 8));
	    shapes.add(new Sphere(4));
	    shapes.add(new Cube(8));

	    for (Shape3D shape : shapes) {
	    	shape.type();
	    	shape.volume();
	    	shape.surfaceArea();
	    	shape.lateralSurfaceArea();
	    }
	}

}
