package task1;

public class Fireman implements Saveable{
	String name;
	
	public Fireman(String name) {
		this.name = name;
	}
	
	public void saveLives() {
		System.out.println(name + " saved people.");
	}
}
