package prog2_1_startup;

/**
 * Creates a few Employees, stores them in an array.
 * Then locates all Employees with first name Bill
 * 
 * @author Mei Li
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Address add1A = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("322 Harrison", "Fairfield", "IA", "52556");
		Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");
		
		Employee e1 = new Employee("Joe", "Smith");
		e1.setSalary(100000);
		e1.setHome(add1A);
		e1.setWork(add1B);
		
		Employee e2 = new Employee("Bill", "Jones");
		e2.setSalary(120000);
		e2.setHome(add2A);
		e2.setWork(add2B);
		
		//print info about Employee 1
		System.out.println(e1.toString());
		System.out.println(" Home address: "+e1.getHome().toString());
		System.out.println(" Work address: " +e1.getWork().toString());
		
		//Create an Employee array of length 2
		Employee[] empArray = new Employee[2];
		empArray[0] = e1;
		empArray[1] = e2;
		
		//Search the array for an Employee having first name "Bill"
		//If found, print out the Employee's full name
		for(int i = 0; i < empArray.length; ++i) {
			String firstName = empArray[i].getFirstName();
			if(firstName.equals("Bill")) {
				System.out.println("Found Bill! " + empArray[i].toString());
			}
		}
	}

}
