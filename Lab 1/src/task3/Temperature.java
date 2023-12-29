package task3;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
		this.value=0.0;
		this.scale='C';
	}
	
	public Temperature(double value) {
		this.value=value;
		this.scale='C';
	}
	
	public Temperature(char scale) {
		this.value=0.0;
		this.scale=scale;
	}
	
	public Temperature(double value, char scale) {
		this.value=value;
		this.scale=scale;
	}
	
	public double getValue() {
		return value;
	}
	
	public char getScale() {
		return scale;
	}
	
	public double getCelsius() {
        if (scale=='F') {
            return(5*(value-32))/9;
        } 
        else {
            return value;
        }
    }

    public double getFahrenheit() {
        if (scale=='C') {
            return (9*value/5)+32;
        } 
        else {
            return value;
        }
    }
    
    public void setValue(double value) {
    	this.value=value;
    }
	
    public void setScale(char scale) {
        this.scale=scale;
    }

    public void setValueAndScale(double value, char scale) {
        this.value=value;
        this.scale=scale;
    }
}
