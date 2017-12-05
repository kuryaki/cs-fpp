package prog6.case2;

import java.util.GregorianCalendar;


public class Person {

	private String name;
	private GregorianCalendar dateOfBirth;
	Person(String name, GregorianCalendar dob) {
		this.name = name;
		dateOfBirth = dob;
	}
	public String getName() {
		return name;
	}
	
	public GregorianCalendar getDateOfBirth() {
		return (GregorianCalendar)dateOfBirth.clone();
	}
	
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(!(ob instanceof Person)) return false;
		Person p = (Person)ob;
		return p.name.equals(name) && p.dateOfBirth.equals(dateOfBirth);
	}
	
	public int hashCode() {
		int seed = 17;
		int result = 31 * seed + name.hashCode();
		result = 31 * result + dateOfBirth.hashCode();
		return result;
	}
	
	public static void main(String[] args) {
		
		GregorianCalendar dob = new GregorianCalendar(1982, 9, 14);
		
		Person pe1 = new Person("George", dob);
		Person pe2 = new PersonWithJob("George", dob, 5000);
		
//		System.out.println(pe1);
//		System.out.println(pe2);
		
		System.out.println(pe1.equals(pe2));
		System.out.println(pe2.equals(pe1));

	}

}
