package prog6.case3;

import java.util.GregorianCalendar;


public class PersonWithJob {
	private double salary;
	private Person per;
	
	PersonWithJob(String name, GregorianCalendar dob, double salary) {
		this.per = new Person(name, dob);
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public boolean equals(Person ob) {
		if(ob == null) return false;
		Person p = (Person)ob;
		
		return p.getName().equals(this.per.getName()) && p.getDateOfBirth().equals(this.per.getDateOfBirth());
	}
}
