package task1;

public abstract class Superhero {
	String name;
	String alias;
	
	public Superhero(String name, String alias) {
		this.name = name;
		this.alias = alias;
	}
	
	public void sayHello() {
		System.out.println("Hello, I'm " + name + "!");
	}
	
	public abstract void useSuperpower();
}