import java.util.Vector;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Restaurant restaurant = new Restaurant();
        Cat cat = new Cat("Golum");
        Student student = new Student("Aragorn");
        Person person = new Person("Legolas");
        Animal animal = new Animal("Torin");
        
        Vector<CanHavePizza> pizzaeaters = new Vector<CanHavePizza>();
        pizzaeaters.add(person);
        pizzaeaters.add(student);
        pizzaeaters.add(cat);
        pizzaeaters.add(animal);
        
        for(CanHavePizza eater : pizzaeaters) {
        	restaurant.servePizza(eater);
        }
        
        student.dance();
        student.move();
        student.retake();
	}

}
