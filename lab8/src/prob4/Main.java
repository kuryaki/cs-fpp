package prob4;

import java.util.ArrayList;
import java.util.List;

public class Main {
	private List<Address> listOfAddresses;
	private StringBuilder output = new StringBuilder();
	
	public static void main(String[] args) {
		Main m = new Main();
		m.loadData();
		m.printAsUpperCase();
	}
	private void loadData(){
		listOfAddresses = new ArrayList<>();
		listOfAddresses.add(new Address("Jim", "101 Adams", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Tom", "30 W. Burlington", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Hal", "14 E. Court", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("Sally", "410 W. Jefferson", "Fairfield", "IA", "52556"));
		listOfAddresses.add(new Address("MUM", "1000 N. 4th St", "Fairfield", "IA", "52556"));
		

	}
	
	public void printAsUpperCase() {
		
		listOfAddresses.forEach(element -> {
			
			System.out.println(formatFields(element.toUpper()));
		});
		
	}
	
	private String formatFields(List<String> list) {
		
		String output = "";
		
		output += list.get(0) + "\n";
		output += list.get(1) + "\n";
		output += list.get(2) + ", " + list.get(3) + " " + list.get(4) + "\n";
		
		return output;
	}
	
	
	

}
