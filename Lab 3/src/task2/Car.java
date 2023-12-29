package task2;

public class Car implements Movable{
	String model;
	
	public Car(String model) {
		this.model = model;
	}
	
	public void move() {
		System.out.println(model + " is moving.");	
	}
	
}
