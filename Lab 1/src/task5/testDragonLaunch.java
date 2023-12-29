package task5;

public class testDragonLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person g=new Person(Gender.GIRL);
		Person b=new Person(Gender.BOY);
		DragonLaunch dragonLaunch=new DragonLaunch();
		
		dragonLaunch.kidnap(g);
		dragonLaunch.kidnap(b);
		dragonLaunch.kidnap(g);
		dragonLaunch.kidnap(g);
		
		boolean willEat=dragonLaunch.willDragonEatOrNot();
        
        if (willEat) {
            System.out.println("The dragon will eat!");
        } 
        else {
            System.out.println("The dragon will not eat! Love won!");
        }
		
	}

}
