package task1a;

public class Cube extends Shape3D{
	int a;
	
	public Cube(int a) {
		this.a = a;
		
	}
	
	public void volume() {
		double V = a * a * a;
		System.out.println("Volume = " + V);
	}

	public void surfaceArea() {
		double S = 6 * a * a;
		System.out.println("Surface area = " + S);
	}

	public void lateralSurfaceArea() {
		double S = 4 * a * a;
		System.out.println("Lateral surface area = " + S);
	}

	public void type() {
		System.out.println("Shape type: Cube");
	}
}
