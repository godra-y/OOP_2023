package task1a;

public class Sphere extends Shape3D{
	int radius;
	
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	public void volume() {
		double V = (4/3) * Math.PI * radius * radius * radius;;
		System.out.println("Volume = " + V);
	}

	public void surfaceArea() {
		double S = 4 * Math.PI * radius * radius;;
		System.out.println("Surface area = " + S);
	}

	public void lateralSurfaceArea() {
		System.out.println("Sphere doesn't have a lateral surface area");
	}

	public void type() {
		System.out.println("Shape type: Sphere");
	}
}
