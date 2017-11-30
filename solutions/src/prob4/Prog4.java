package prob4;

public class Prog4 {
	
	
	public static void main(String[] args) {
		
		String[] data = Data.records.split(":");
		
		for (String elem : data) {
			
			System.out.println(elem.split(",")[0]);
		}
		
		
	};

}
