package task5;

public class Resistor extends Circuit{
	private double resistance;
	private double pottentialDifference;
	
	public Resistor(double resistance) {
		this.resistance = resistance;
	}
	
	public double getResistance() {
		return resistance;
	}
	
	public double getPotentialDiff() {
		return pottentialDifference;
	}
	
	public void applyPotentialDiff(double V) {
		pottentialDifference = V;
	}
}
