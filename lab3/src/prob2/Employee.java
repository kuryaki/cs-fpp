package prob2;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {

	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	// constructor
	public Employee(String name, int aYear, int aMonth, int aDay) {

		this.name = name;
		this.hireDate = LocalDate.of(aYear, aMonth, aDay);
	}

	public void createNewChecking(double startAmout) {
//		Account checkingAccount = new Account(employee, AccountType.CHECKING, 300);
	}

	public void createNewSavings(double startAmout) {
//		Account savingsAccount = new Account(employee, AccountType.SAVINGS, 300);
	}

	public void createNewRetirement(double startAmout) {
//		Account retirementAccount = new Account(employee, AccountType.RETIREMENT, 300);
	}
	
	public void deposit(AccountType accountType, double amount) {
		
	}
	
	public void withdraw(AccountType accountType, double amount) {
		
	}
	
	 public String getFormattedAcctInfo() {
		 return null;
	 }

	// instance methods
	public String getName() {
		return name;
	}

	// needs to be improved
	public LocalDate getHireDate() {
		return hireDate;
	}

}
