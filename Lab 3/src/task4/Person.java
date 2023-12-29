package task4;

public class Person {
	String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "name: " + name;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Person)) {
			return false;
		}
		Person otherPerson = (Person)o;
		return name.equals(otherPerson.name);
	}
}
