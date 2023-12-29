package practice2;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t=new Time(23, 5, 6);
        System.out.println(t.getToUniversal()); 
        System.out.println(t.getToStandard()); 

        Time t2=new Time(4, 24, 33);
        t.add(t2);

        System.out.println(t.getToUniversal());
        System.out.println(t.getToStandard());
	}

}
