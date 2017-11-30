package prob1;

public class Main {

	public static void main(String[] args) {

		Address add1A = new Address("10 Adams", "Fairfield", "IA", "52556");
		Address add1B = new Address("110 Burlington", "Fairfield", "IA", "52556");
		Address add2A = new Address("322 Harrison", "Fairfield", "IA", "52556");
		Address add2B = new Address("2210 Burlington", "Fairfield", "IA", "52556");

		Customer bob = new Customer("Bob", "Rob", "678123123");

		bob.setBillingAddress(add1A);
		bob.setShippingAddress(add1B);

		Customer rob = new Customer("Rob", "Bob", "876123123");

		rob.setBillingAddress(add2A);
		rob.setShippingAddress(add2B);
		
		Customer[] customers = {rob, bob};
		
		for(Customer customer : customers) {
			
			System.out.println(customer.toString());
		}


	}

}
