
public class Triangle extends Shape{
	int base;
	int height;

	public Triangle(int position, Color color, int base, int height) {
		super(position, color);
	    this.base=base;
	    this.height=height;
	}

	public void draw() {
		for(int i=0; i<=position; i++) {
	    	System.out.print(" ");
	    }
		
        if (color==Color.BLUE)
            System.out.println("/\\");
        else
            System.err.println("/\\");
        
        System.out.println("shape: triangle"+", color: "+color+", base: "+base+", height: "+height);
	}
}
