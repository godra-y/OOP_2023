package task3;

public class testTemperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temperature t1=new Temperature();
		Temperature t2=new Temperature(95, 'F');
		Temperature t3=new Temperature();
		
		System.out.println(t1.getCelsius());
		System.out.println(t1.getFahrenheit());
		System.out.println(t1.getScale());
		
		System.out.println(t2.getCelsius());
		System.out.println(t2.getFahrenheit());
		
		t3.setValue(25);
		t3.setScale('C');
        System.out.println(t3.getCelsius()); 
        System.out.println(t3.getFahrenheit());
		
	}

}
