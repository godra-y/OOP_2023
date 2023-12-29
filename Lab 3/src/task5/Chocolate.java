package task5;

public class Chocolate implements Comparable<Chocolate>{
	private double weight;
	private String name;
	
	public Chocolate(int weight, String name) {
		this.weight = weight;
		this.name = name;
	}
	
	public String toString() {
		return "name: " + name + ", weight: " + weight;
	}

	public int compareTo(Chocolate o) {
		return Double.compare(this.weight, o.weight);
	}
}
