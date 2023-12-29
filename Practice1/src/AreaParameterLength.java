import java.util.Scanner;
public class AreaParameterLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int a;
		int s; 
		int p;
		double d;
		
		System.out.print("Enter the length of the side of the square: ");
		a=input.nextInt();
		
		s=a*a;
		p=a+a+a+a;
		d=Math.sqrt(2)*a;
		
		System.out.print("Area: "+s);
		System.out.print("\nPerimeter: "+p);
		System.out.print("\nLength of diagonal: "+d);
	}

}
