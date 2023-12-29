package task5;

public class Parallel extends Circuit{
	private Circuit c1;
    private Circuit c2;

    public Parallel(Circuit circuit1, Circuit circuit2) {
        this.c1 = circuit1;
        this.c2 = circuit2;
    }

    public double getResistance() {
        return 1.0 / (1.0 / c1.getResistance() + 1.0 / c2.getResistance());
    }

    public double getPotentialDiff() {
        return c1.getPotentialDiff();  
    }

    public void applyPotentialDiff(double V) {
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}
