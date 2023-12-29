package task4;

import java.util.Vector;
import java.util.Date;

public class Manager extends Employee implements Comparable<Employee>, Cloneable{
	Vector<Employee> team;
	double bonus;
	
	public Manager(String name, double annualSalary, Date HireDate, String insuranceNumber, Vector<Employee> team, double bonus) {
        super(name, annualSalary, HireDate, insuranceNumber);
        this.team = team;
        this.bonus = bonus;
    }
	
	public String toString() {
		return super.toString() + ", team: " + team + ", bonus: " + bonus;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Manager)) {
			return false;
		}
		Manager otherManager = (Manager)o;
		return super.equals(o) && team.equals(otherManager.team) && bonus == otherManager.bonus;
	}
	
	public int compareTo(Manager o) {
		int superComparison = super.compareTo(o);
	    if (superComparison != 0) {
	        return superComparison;
	    }
	    if (this.bonus > o.bonus) return 1;
	    if (this.bonus < o.bonus) return -1;
	    return 0;
	}
	
	public Object clone() throws CloneNotSupportedException{
		Manager m = (Manager)super.clone();
		m.team = (Vector<Employee>)team.clone();
		return m;
	}
}
