package practice1;

public class Student {
	private String name;
	int id;
	int age;
	static int numOfStudents;
	Major major;
	
	public Student() { 
		this.id = numOfStudents++;
	}
	
	public Student(String name) {
		this();
		this.name = name;
	}
	
	public Student(String name, int age) {
		this(name);
		this.age = age;
	}
	
	public Student(String name, int age, Major major) {
		this(name, age);
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.id+" "+getName()+" "+age+" "+major;
	}
}
