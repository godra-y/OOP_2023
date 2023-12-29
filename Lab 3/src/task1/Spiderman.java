package task1;

public class Spiderman extends Superhero implements Shootable, Saveable{
	int webLength;
	
	public Spiderman(String name, String alias, int webLength) {
		super(name, alias);
		this.webLength = webLength;
	}
	
	public void useSuperpower() {
		System.out.println(alias + " can easily climb walls.");
	}
	
	public void shoot() {
		if(webLength > 0) {
			System.out.println("Shooting webs!");
			webLength -= 10;
		}
		else {
			System.out.println("The web is over!");
		}
	}
	
	public void saveLives() {
		System.out.println(alias + " saved Mary Jane.");
	}
}
