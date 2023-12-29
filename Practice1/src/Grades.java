import java.util.Scanner;
public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		
		System.out.print("Enter the number: ");
		n=input.nextInt();
		
		if(n>=95 && n<=100){
            System.out.println("Grade is A");
        }
		else if(n>=90 && n<=94){
            System.out.println("Grade is A-");
		}
        else if(n>=85 && n<=89){
            System.out.println("Grade is B+");
        }
        else if(n>=80 && n<=84){
            System.out.println("Grade is B");
        }
        else if(n>=75 && n<=79){
            System.out.println("Grade is B-");
        }
        else if(n>=70 && n<=74){
            System.out.println("Grade is C+");
        }
        else if(n>=65 && n<=69){
            System.out.println("Grade is C");
        }
        else if(n>=60 && n<=64){
            System.out.println("Grade is C-");
        }
        else if(n>=55 && n<=59){
            System.out.println("Grade is D+");
        }
        else if(n>=50 && n<=54){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Оценка: F");
        }
	}

}
