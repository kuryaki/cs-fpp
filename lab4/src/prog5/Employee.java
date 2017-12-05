package prog5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee implements Comparable<Employee> {
	private String name;
	private int salary;
	private LocalDate hireDate;

	public Employee(String name, int salary, int year, int month, int day) {
		this.name = name;
		this.salary = salary;
		hireDate = LocalDate.of(year, month, day);
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public int compareTo(Employee other) {
		
		int i = this.name.compareTo(other.name);
	    if (i != 0) return i;

	    if (Integer.compare(this.salary, other.salary) != 0) return i;
		
		return this.hireDate.compareTo(other.hireDate);
	}
	
	public String toString() {
		String formattedDate = hireDate.format(DateTimeFormatter.ofPattern("MM/dd/YY"));
		return "<name:"+ name +" salary: " + salary + " hire date: " + formattedDate + ">";
	}

}
