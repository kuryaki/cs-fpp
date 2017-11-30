
public class Customer {
	
	private String firstName;
	private String lastName;
	private String socSecurityNum;
	private Address billingAddress;
	private Address shippingAddress;
	
	public Customer(String firstName, String lastName, String socSecurityNum) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
	};

	public String toString() {
		return "[" + firstName + " " + lastName + ", ssn: " + socSecurityNum + "]";
	}

}
