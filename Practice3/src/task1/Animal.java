package task1;

public class Animal {
	protected String name;
	protected int age;
	protected String habitat;
	
	public Animal(String name, int age, String habitat) {
		this.name=name;
		this.age=age;
		this.habitat=habitat;
	}
	
	public void voice() {
        System.out.println(name+" makes a sound.");
    }

    public void move() {
        System.out.println(name+" moves in some way.");
    }

    public void eat(String food) {
        System.out.println(name+" is eating "+food+".");
    }

    public void sleep() {
        System.out.println(name+" is sleeping.");
    }
	
    public String toString() {
    	return "name: "+name+", age: "+age+", group: "+habitat;

	}
	
    
	
	
}
