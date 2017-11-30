package prob3;

public class Prog3 {
	

	public static void main(String[] args) {
		float n1 = 1.27f;
		float n2 = 3.881f;
		float n3 = 9.6f;
		
		int castedSum = (int) (n1 + n2 + n3);
		int roundedSum = Math.round(n1 + n2 + n3);
		
		System.out.println(castedSum);
		System.out.println(roundedSum);
	}

}
