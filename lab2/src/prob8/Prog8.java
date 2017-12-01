package prob8;

public class Prog8 {
	
	public static int min(int[] arrayOfInts) {
		
		int min = 0;
		
		for(int num : arrayOfInts) {
			if(num < min) {
				min = num;
			}
		}
		
		return min;
	};

}
