package prob2;

import java.util.Scanner;

import prob2.employeeinfo.Employee;

public class Main {

	Employee[] emps = null;

	public static void main(String[] args) {
		new Main();
	}

	Main() {
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2, 13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(12600);
		emps[2].createNewRetirement(9000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("See a report of all account balances? (y/n) ");
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("y")) {
			String info = getFormattedAccountInfo();
			System.out.println(info);
		}  
		else {    
			
		}    
		
	}
	
	String getFormattedAccountInfo() {
		
		String formattedAccInfo = "";
		
		for(Employee e: emps) {
			formattedAccInfo += "ACCOUNT INFO FOR " + e.getName() + ": \n";
			formattedAccInfo += e.getFormattedAcctInfo();
			formattedAccInfo += "\n";
		}
		
		return formattedAccInfo;
	}

}
