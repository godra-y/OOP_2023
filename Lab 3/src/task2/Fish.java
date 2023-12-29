package task2;

public class Fish implements Swimable{
	String name;
	int distance;
	
	public Fish(String name) {
		this.name = name;
	}
	
	public void move() {
		System.out.println(name + " is moving");
	}

	public void swim(int x) {
		System.out.println(name + " is swimming " + x + " meters");
		distance += x;
		System.out.println(name + " swam " + distance + " meters");
	}
	
	
}
