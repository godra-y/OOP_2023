
public class Restaurant{
	void servePizza(CanHavePizza eater) {
		if(eater instanceof Person) {
			System.out.println("Processing payments for the person.");
			Person person = (Person)eater;
			person.payment();
			person.eatPizza();
			
        }
		
		else if(eater instanceof Cat){
			Cat cat = (Cat)eater;
			cat.eatPizza();	
			
		}
		
		else System.out.println("Who are you?");
	}
}
