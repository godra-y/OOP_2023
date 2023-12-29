package task2;

import java.util.Objects;

public class Laptop extends Gadget{
	private String os;
	private int memory;
	
	public Laptop (String model, String brand, String os, int memory) {
		super(model, brand);
		this.os = os;
		this.memory = memory;
	}
	
	public void connection() {
		System.out.println("Laptop is connected");
	}
	
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if(!(o instanceof Gadget)) {
			return false;
		}
	    Laptop otherLaptop = (Laptop) o;
	    return super.equals(o) && os.equals(otherLaptop.os) && memory == otherLaptop.memory;
	}
	
	public int hashCode() {
		return Objects.hash(super.hashCode(), os, memory);
	}
	
	public String getOs() {
		return os;
	}
	
	public int getMemory() {
		return memory;
	}
	
	public String toString() {
		return super.toString() + ", " + " Operating system: " + getOs() + ", " + "Memory: " + getMemory() + "Tb.";
	}
	
}
