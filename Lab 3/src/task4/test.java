package task4;

import java.util.Date;
import java.util.Vector;
import java.util.Collections;

public class test {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO Auto-generated method stub
		Person p1 = new Person("Will");
		Person p2 = new Person("Will");
		
		Employee e1 = new Employee("John", 1000, new Date(), "A-123");
        Employee e2 = new Employee("April", 1500, new Date(), "B-123");
        Employee e3 = new Employee("Mark", 500, new Date(), "C-123");

        Vector<Employee> team = new Vector<>();
        team.add(e1);
        team.add(e2);

        Manager m1 = new Manager("Robert", 1300, new Date(), "E-123", team, 100);
        Manager m2 = new Manager("Mike", 1300, new Date(), "F-123", team, 110);

        System.out.println("Person 1 equals Person 2: " + p1.equals(p2));
        System.out.println("Employee 1 equals Employee 2: " + e1.equals(e2));
        
        System.out.println("\nSalary comparison: " + e1.compareTo(e3));
        System.out.println("Salary comparison: " + m1.compareTo(m2));

        Vector<Employee> employees = new Vector<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        
        System.out.println("\nBefore sorting employees by name:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("\nAfter sorting employees by name:");
        Collections.sort(employees, new NameComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nBefore sorting employees hire date:");
        for (Employee e : employees) {
            System.out.println(e);
        }
        System.out.println("\nAfter sorting employees hire date:");
        Collections.sort(employees, new DateComparator());
        for (Employee e : employees) {
            System.out.println(e);
        }
        
        Employee clonedEmployee = (Employee) e1.clone();
        clonedEmployee.annualSalary = 1400;
        System.out.println("\nObject Employee: " + e1);
        System.out.println("Cloned Employee: " + clonedEmployee);
        
        Manager clonedManager = (Manager) m1.clone();
        System.out.println("\nCloned Manager: " + clonedManager);
	}
}
		
		