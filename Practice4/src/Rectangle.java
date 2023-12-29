
public class Rectangle extends Shape{
	int width;
	int height;

	public Rectangle(int position, Color color, int width, int height) {
		super(position, color);
	    this.width=width;
	    this.height=height;
	 }

	public void draw() {
		for(int i=0; i<=position; i++) {
	    	System.out.print(" ");
	    }
		
	    if(color==Color.GREEN)
	    	System.out.println("[]");
	    else System.err.println("[]");
	    
	    System.out.println("shape: rectangle "+", color: "+color+", width: "+width+", height: "+height);
	}
}
