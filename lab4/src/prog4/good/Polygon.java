package prog4.good;

public interface Polygon {
	
	default double computePermiter() {
		return sum(this.getArrayOfSides());
	};
	
	public abstract double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		double sum = 0;
		
		for(double elem : arr) {
			sum += elem;
		}
		
		return sum;
	}

}
