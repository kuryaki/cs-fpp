package prob2.employeeinfo;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

import prob2.Account;
import prob2.AccountType;

public class Employee {

	private Account savingsAccount;
	private Account checkingAccount;
	private Account retirementAccount;
	private String name;
	private LocalDate hireDate;

	// constructor
	public Employee(String name, int hireYear, int hireMonth, int hireDay) {

		this.name = name;

		this.hireDate = LocalDate.of(hireYear, hireMonth, hireDay);
	}

	public void createNewChecking(double startAmout) {
		this.checkingAccount = new Account(this, AccountType.CHECKING, startAmout);
	}

	public void createNewSavings(double startAmout) {
		this.savingsAccount = new Account(this, AccountType.SAVINGS, startAmout);
	}

	public void createNewRetirement(double startAmout) {
		this.retirementAccount = new Account(this, AccountType.RETIREMENT, startAmout);
	}

	public void deposit(AccountType accountType, double amount) {
		switch (accountType) {
		case CHECKING:
			this.checkingAccount.makeDeposit(amount);
			break;
		case SAVINGS:
			this.savingsAccount.makeDeposit(amount);
			break;
		case RETIREMENT:
			this.retirementAccount.makeDeposit(amount);
			break;
		}

	}

	public void withdraw(AccountType accountType, double amount) {
		switch (accountType) {
		case CHECKING:
			this.checkingAccount.makeWithdrawal(amount);
			break;
		case SAVINGS:
			this.savingsAccount.makeWithdrawal(amount);
			break;
		case RETIREMENT:
			this.retirementAccount.makeWithdrawal(amount);
			break;
		}

	}

	public String getFormattedAcctInfo() {
		String formattedAccInfo = "";

		if (this.checkingAccount != null) {
			formattedAccInfo += "Account type: checking \n";
			formattedAccInfo += "Current bal: " + this.checkingAccount.getBalance() + " \n";
		}
		if (this.savingsAccount != null) {
			formattedAccInfo += "Account type: savings \n";
			formattedAccInfo += "Current bal: " + this.savingsAccount.getBalance() + " \n";
		}
		if (this.retirementAccount != null) {
			formattedAccInfo += "Account type: retirement \n";
			formattedAccInfo += "Current bal: " + this.retirementAccount.getBalance() + " \n";
		}

		return formattedAccInfo;
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
