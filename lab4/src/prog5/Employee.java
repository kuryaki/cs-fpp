package prog5;

import java.util.Date;
import java.util.GregorianCalendar;


public class Employee {
	private String name;
	private int salary;
	private Date hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		GregorianCalendar cal = new GregorianCalendar(year, month-1, day);
		hireDate = cal.getTime();
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public Date getHireDate() {
		Date returnVal = (Date) hireDate.clone();
		return returnVal;
	}

}
