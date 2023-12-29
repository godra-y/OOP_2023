package task5;

public class Series extends Circuit{
	Circuit c1;
	Circuit c2;
	
	public Series(Circuit c1, Circuit c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	
	public double getResistance() {
		return c1.getResistance() + c2.getResistance();
	}
	
	public double getPotentialDiff() {
		return c1.getPotentialDiff() + c2.getPotentialDiff();
	}
	
	public void applyPotentialDiff(double V) {
		double totalResistance = getResistance();
        c1.applyPotentialDiff(V * c1.getResistance() / totalResistance);
        c2.applyPotentialDiff(V * c2.getResistance() / totalResistance);
	}
}
