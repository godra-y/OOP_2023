package task4;

import java.util.Date;

public class Employee extends Person implements Comparable<Employee>, Cloneable{
	double annualSalary;
	Date HireDate;
	String insuranceNumber;
	
	public Employee(String name, double annualSalary, Date HireDate, String insuranceNumber) {
		super(name);
		this.annualSalary = annualSalary;
		this.HireDate = HireDate;
		this.insuranceNumber = insuranceNumber;
	}
	
	public String toString() {
		return super.toString() + ", annual salary: " + annualSalary + ", hire date: " + HireDate + 
    			", national insurance number: " + insuranceNumber;
	}
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Employee)) {
			return false;
		}
		Employee otherEmployee = (Employee)o;
		return super.equals(o) && annualSalary == otherEmployee.annualSalary && HireDate.equals(otherEmployee.HireDate)
        		&& insuranceNumber.equals(otherEmployee.insuranceNumber);
	}

	public int compareTo(Employee o) {
		if(this.annualSalary > o.annualSalary) return 1;
		if(this.annualSalary < o.annualSalary) return -1;
		return 0;
	}
	
	public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
}
