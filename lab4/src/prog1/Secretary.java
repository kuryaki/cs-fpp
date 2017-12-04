package prog1;

import java.time.LocalDate;

public class Secretary extends DeptEmployee {
	
	private double overtimeHours;
	
	public Secretary(double salary, String name, LocalDate hireDate, double overtimeHours) {
		super(salary, name, hireDate);
		this.overtimeHours = overtimeHours;
	}

	public double getOvertimeHours() {
		return overtimeHours;
	}

	public void setOvertimeHours(double overtimeHours) {
		this.overtimeHours = overtimeHours;
	}
	
	@Override
	public double computeSalary() {
		return (salary + 12 * overtimeHours);
	}

}
