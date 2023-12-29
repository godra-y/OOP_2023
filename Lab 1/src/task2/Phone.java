package task2;

public class Phone {
	private Brands brand;
	private final String model;
	private final String memory;
	private final String manufacturer;
	private final int year;
	private int price;
	static int count=0;

	{
		count++;
	}

	public Phone(Brands brand, String model, String memory, String manufacturer, int year) {
		this.brand=brand;
    	this.model=model;
    	this.memory=memory;
    	this.manufacturer=manufacturer;   
        this.year=year;
        this.price=0;
	}
	
	public Phone(Brands brand, String model, String memory, String manufacturer, int year, int price) {
		this(brand, model, memory, manufacturer, year);
		this.price=price;
	}
	
	public static int getCount() {
		return count;
	}
	
	public Brands getBrand() {
		return brand;
	}
	
	public String getModel() {
        return model;
    }
    
    public String getMemory() {
        return memory;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
    	this.price=price;
    }
    public String toString() {
		return brand+ ", "+model+ ", "+memory+ ", "+year + ", "+manufacturer + ", "+price + " tenge.";
	}
}
