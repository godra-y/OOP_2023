import java.util.Scanner;
public class NewBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int ib=30000;
		int ii=15;
		
		System.out.print("Enter the number of years: ");
        int y=input.nextInt();
        
        double b=ib;
        for(int i=0; i<y; i++){
            b+=(b*ii/100);
        }
        
        System.out.println(b);
	
	}

}
