package prog4;

import prog4.good.Polygon;

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
	public double[] getArrayOfSides() {
		double[] sides = {width, length, width, length};
		return sides;
	}

}
