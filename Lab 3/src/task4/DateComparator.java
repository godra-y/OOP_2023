package task4;

import java.util.Comparator;

public class DateComparator implements Comparator<Employee>{
	public int compare(Employee o1, Employee o2) {
		return o1.HireDate.compareTo(o2.HireDate);
	}
}
