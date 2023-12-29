package task2;

import java.util.Objects;

public class Gadget {
	private String model;
	private String brand;
	
	public Gadget(String model, String brand) {
		this.model = model;
		this.brand = brand;
	}
	
	public void connection() {
		System.out.println("Gadget is disabled.");
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Gadget)) {
			return false;
		}
		Gadget otherGadget = (Gadget)o;
		return model.equals(otherGadget.model) && brand.equals(otherGadget.brand); 
	}
	
	public int hashCode() {
		return Objects.hash(model, brand);
	}
	
	public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    } 
    
    public String toString() {
    	return "Brand: " + getBrand() + ", " + "Model: " + getModel();
    }
}
