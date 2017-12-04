package prog3;

import prog3.good.Polygon;

public class Rectangle extends ClosedCurve implements Polygon {
	
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

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePermiters() {
		
		return 2 * (width + length);
	}

}
