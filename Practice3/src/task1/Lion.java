package task1;

public class Lion extends Animal{
	String color;
	
	public Lion(String name, int age, String habitat, String color) {
        super(name, age, habitat);
        this.color=color;
    }

    @Override
    public void voice() {
        System.out.println(name+" roars.");
    }
    public void move(int x) {
        System.out.println(name+" runs "+x+" meters.");
    }

    public void hunt() {
        System.out.println(name+" is hunting.");
    }

    public String toString() {
    	return super.toString()+", color: "+color;
    }
    
    
}
