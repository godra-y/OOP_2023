package task2;

import java.util.HashSet;
import java.util.Set;

public class testGadget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Gadget> gadgetSet = new HashSet<>();
		
		Gadget g1 = new Gadget("Sony", "Xperia");
        Gadget g2 = new Gadget("Apple", "iPhone");
        Laptop l1 = new Laptop("Dell", "Inspiron", "Windows", 1);
        Laptop l2 = new Laptop("Apple", "MacBook Pro", "macOS", 1);
        
        gadgetSet.add(g1);
        gadgetSet.add(g2);
        gadgetSet.add(l1);
        gadgetSet.add(l2);
        
        for (Gadget gadget : gadgetSet) { 
        	gadget.connection();
        }
        
        for (Gadget gadget : gadgetSet) {
            System.out.println(gadget.getBrand() + " " + gadget.getModel()); 
            System.out.println(gadget.toString());
            System.out.println(gadget.hashCode());
        }
  
	}

}
