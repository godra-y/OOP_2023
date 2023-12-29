package task5;

import java.util.Date;
import practice2.*;
import task4.Employee;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Chocolate[] chocolates = {
                new Chocolate(50, "Twix"),
                new Chocolate(30, "KitKat"),
                new Chocolate(40, "Snickers")
        };

        System.out.println("Chocolates before sorting:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Sort.bubbleSort(chocolates);

        System.out.println("\nChocolates after sorting:");
        for (Chocolate c : chocolates) {
            System.out.println(c);
        }

        Time[] times = {
                new Time(12, 30, 0),
                new Time(9, 45, 0),
                new Time(15, 15, 0)
        };

        System.out.println("\nTimes before sorting:");
        for (Time t : times) {
            System.out.println(t.getToStandard());
        }

        Sort.selectionSort(times);

        System.out.println("\nTimes after sorting:");
        for (Time t : times) {
            System.out.println(t.getToStandard());
        }
        
        Employee[] employees = {
        		new Employee("John Doe", 50000, new Date(), "NI123"),
                new Employee("Jane Smith", 60000, new Date(), "NI456"),
                new Employee("Alan Smith", 70000, new Date(), "NI789")
        };

        System.out.println("\nEmployees before sorting:");
        for (Employee e : employees) {
        	System.out.println(e);
        }

        Sort.selectionSort(employees);

        System.out.println("\nEmployees after sorting by salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }
	}
}
