
public class Circle extends Shape{
	int radius;

	public Circle(int position, Color color, int radius) {
	    super(position, color);
	    this.radius=radius;
	}
	
	public void draw() {
	    for(int i=0; i<=position; i++) {
	    	System.out.print(" ");
	    }
	    	
	    if(color==Color.RED)
	    	System.out.println("()");
	    else System.err.println("()");
	    
	    System.out.println("shape: circle"+", color: "+color+", radius: "+radius);

	}
}
