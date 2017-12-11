package prob1;

public class Exponential {

	public static void main(String[] args) {
		
		int res = Exponential.power(2, 10);
		System.out.println(res);
	}

	private static int power(int x, int n) {
		return n == 0 ? 1 : x * power(x, n-1);
	}

}
