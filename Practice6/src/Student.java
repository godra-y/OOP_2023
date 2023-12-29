
public class Student extends Person implements CanHavePizza, CanHaveParty, Movable, CanHaveRetake{
	public Student(String name) {
		super(name);
	}
	
	public void eatPizza() {
        System.out.println(name + " is eating pizza.");
    }

    public void move() {
        System.out.println(name + " is moving.");
    }

    public void dance() {
        System.out.println(name + " is dancing.");
    }
    
    public void retake() {
    	System.out.println(name + " has retake.");
    }
}
