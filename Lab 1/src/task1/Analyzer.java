package task1;
import java.util.Scanner;
public class Analyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		Data data=new Data();
		
		while(true) {
			System.out.print("Enter number (Q to quit):  ");
			if (scanner.hasNextDouble()) {
				double value=scanner.nextDouble();
				data.addValue(value);
			}
			else {
				String input=scanner.next();
				if(input.equalsIgnoreCase("Q")) {
					break;
				}
				else {
					System.out.println("Enter number (To quit): ");
				}
			}
		}
		
		double average=data.getAverage();
		double max=data.getLargestNum();
		
		System.out.println("Average = "+average);
        System.out.println("Maximum = "+max);
	}

}
