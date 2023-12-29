package task1;

public class Salary {
	void receivePayment(Saveable o) {
		if(o instanceof Fireman) {
			Fireman fireman = (Fireman)o;
			fireman.saveLives();
			System.out.println("Fireman gets paid.");
		}
		else if(o instanceof Spiderman) {
			Spiderman spiderman = (Spiderman)o;
			spiderman.saveLives();
			System.out.println("Spiderman doesn't get paid.");
		}
	}
}
