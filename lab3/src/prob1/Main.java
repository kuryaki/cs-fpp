package prob1;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee("David Roncancio", "Kuryaki", 80000, 2014, 5, 13);
		Account checkingAccount = new Account(employee, AccountType.CHECKING, 300);
		Account savingsAccount = new Account(employee, AccountType.SAVINGS, 300);
		Account retirementAccount = new Account(employee, AccountType.RETIREMENT, 300);
		
		System.out.println(checkingAccount.toString());
		System.out.println(savingsAccount.toString());
		System.out.println(retirementAccount.toString());
		
	}

}
