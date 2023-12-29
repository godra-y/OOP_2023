package task1a;

public class Cylinder extends Shape3D {
	int radius;
	int height;
	
	public Cylinder(int radius, int height) {
		this.radius = radius;
		this.height = height;
	}
	
	public void volume() {
		double V = Math.PI * radius * radius * height;
		System.out.println("Volume = " + V);
	}

	public void surfaceArea() {
		double S = 2 * Math.PI * radius * (radius + height);
		System.out.println("Surface area = " + S);
	}

	public void lateralSurfaceArea() {
		double S = 2 * Math.PI * radius * height;
		System.out.println("Lateral surface area = " + S);
	}

	public void type() {
		System.out.println("Shape type: Cylinder");
	}
}
