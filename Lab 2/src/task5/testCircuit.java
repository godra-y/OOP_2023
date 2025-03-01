package task5;

public class testCircuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);
        Circuit f = new Series(a, b);
        Circuit g = new Parallel(c, d);
        Circuit h = new Series(g, e);
        Circuit circuit = new Parallel(h, f);
        circuit.applyPotentialDiff(12.0);  
        double R = circuit.getResistance();
        double power = circuit.getPower();
        double current = circuit.getCurrent();

        System.out.println("R = " + R + " ohms");
        System.out.println("P = " + power + " watts");
        System.out.println("I = " + current + " amperes");
	}

}
