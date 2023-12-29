package task1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spiderman spiderman = new Spiderman("Piter Parker", "Spiderman", 40);
		Fireman fireman = new Fireman("John");
		Salary salary = new Salary();

        spiderman.sayHello(); 
        for (int i = 0; i < Shootable.MAX_SHOTS; i++) {
        	System.out.println("The length of the web is " + spiderman.webLength + " meters");
            spiderman.shoot();           
        }
        spiderman.useSuperpower();
        spiderman.saveLives();
        
        fireman.saveLives();
        
        salary.receivePayment(fireman);
        salary.receivePayment(spiderman);
	}

}
