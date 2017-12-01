package prob2;

public class Prog2 {

	public static void main(String[] args) {
		
		double pi = Math.PI;
		double x = Math.pow(pi,  RandomNumbers.getRandomInt(1, 9));
		double y = Math.pow(RandomNumbers.getRandomInt(3, 14), pi);
		
		System.out.println(x);
		System.out.println(y);

	}

}
