import java.util.Scanner;
public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value a: ");
        double a=input.nextDouble();

        System.out.print("Enter the value b: ");
        double b=input.nextDouble();

        System.out.print("Enter the value c: ");
        double c=input.nextDouble();

        double d=b*b-4*a*c;

        if(d>0){
            double x1=(-b+Math.sqrt(d))/(2*a);
            double x2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("x1="+x1+ ", x2="+x2);
        } 
        else if (d==0){
            double x=-b/(2*a);
            System.out.println("x="+x);
        } 
        else{
            System.out.println("The equation has no real roots.");
        }
	}

}
