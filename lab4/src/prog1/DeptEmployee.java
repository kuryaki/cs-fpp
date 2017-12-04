package prog1;

import java.time.LocalDate;

public class DeptEmployee {
	
	protected double salary;
	private String name;
	private LocalDate hireDate;
	
	public DeptEmployee(double salary, String name, LocalDate hireDate) {
		this.salary = salary;
		this.name = name;
		this.hireDate = hireDate;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	
	public double computeSalary() {
		return salary;
	}

}
