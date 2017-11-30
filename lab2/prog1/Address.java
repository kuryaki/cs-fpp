package prog2_1_startup;

/**
 * Stores data for an address. In this application,
 * an Employee may have a home address and also a work Address.
 * @author Mei Li
 */
public class Address {
	private String street;
	private String city;
	private String state;
	private String zip;
	public Address(String str, String cit, String st, String z) {
		street = str;
		city = cit;
		state = st;
		zip = z;
	}
	/**
	 * Provides a string representation of an address.
	 * @return a string representation of an addresss
	 */
	public String toString() {
		return street + ", " + city + ", "+ state + " " + zip;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getState() {
		return state;
	}
	public String getZip() {
		return zip;
	}
	
	public static void main(String[] args) {
		Address a = new Address("111 Washington Ave", 
				"Fairfield", "IA", "52556");
		System.out.println(a.toString());
	}
}
