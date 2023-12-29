package task1;

public class testAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Lion l=new Lion("Scar", 7, "Jungle", "Orange");
  
        l.voice();    
        l.move(50);         
        l.hunt();  
        l.eat("meat");
        l.sleep();

        System.out.println(l.toString());
	}

}
