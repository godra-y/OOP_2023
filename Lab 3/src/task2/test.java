package task2;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fish f = new Fish("Nemo");
		Car c = new Car("Toyota");
		
		f.distance = 0;
		f.move();
		f.swim(5);
		f.swim(4);
		
		c.move();
	}

}
