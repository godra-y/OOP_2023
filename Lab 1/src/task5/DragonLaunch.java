package task5;
import java.util.Vector;
public class DragonLaunch {
	public Vector<Person> kidnappedPeople;
	int count;
	
	public DragonLaunch() {
		kidnappedPeople=new Vector<>();
	}
	
	public void kidnap(Person P) {
		kidnappedPeople.add(P);
	}
	
	public boolean willDragonEatOrNot() {
		for(int i=0; i<kidnappedPeople.size(); i++) {
			if (count<0) {
				return true;
			}
			else if (kidnappedPeople.get(i).getGender()==Gender.BOY) {
				count++;
			}
			else {
				count--;
			}
		}
		
		if (count%2==0) {
			return false;
		}
		else {
			return true;
		}
	}
}

