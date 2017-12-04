package prog2;

public class Rectangle extends ClosedCurve {
	
	private final double width;
	private final double length;

	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		return width * length;
	}

}
