
public class Person implements CanHavePizza{
	String name;
	public Person(String name) {
		this.name = name;
	}
	public void payment() {
		System.out.println(name + " pays");
	}
	@Override
	public void eatPizza() {
		System.out.println(name + " is eating pizza");
	}
}
