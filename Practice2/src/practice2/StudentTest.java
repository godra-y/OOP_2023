package practice2;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Alnura", "01");
		
		System.out.println("Student 1: Name - "+s1.getName() +
                ", ID - " + s1.getId()+
                ", Year of study - "+s1.getYearOfStudy());
		
		s1.incrementYearOfStudy();
		
		System.out.println("\nNext year: "+s1.getYearOfStudy());
		
	}
}
