package task2;

import java.util.Vector;

public class testPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Vector<Person> people=new Vector<>();

        Person person1=new Person("Jon Snow", "123 Main St");
        Student student1=new Student("Sansa Stark", "456 Elm St", "Information Systems", 2, 5000.0);
        Staff staff1=new Staff("Jorah Mormont", "789 Oak St", "High School", 3000.0);

        people.add(person1);
        people.add(student1);
        people.add(staff1);

        for (Person person : people) {
            System.out.println(person.toString());
        }
        
        System.out.println("After addition one student:");

        Person person2=new Person("Theon Greyjoy", "101 Pine St");
        people.add(person2);

        for (Person person : people) {
            System.out.println(person.toString());
        }
    
	}

}
