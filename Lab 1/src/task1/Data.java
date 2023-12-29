package task1;

public class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		sum=0;
		max=Double.MIN_VALUE;
		count=0;
	}
	
	public void addValue(double value) {
		sum+=value;
		max=Math.max(max, value);
		count++;
	}
	
	public double getAverage() {
		if (count==0) {
			return 0;
		}
		return sum/count;
	}
	
	public double getLargestNum() {
		if (count==0) {
			return 0;
		}
		return max;
	}
}
