package prog4;

import prog4.good.Polygon;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side){
		this.side = side;
		
	}
	
	public double computeArea() {
		return side * side;
	}
	
	@Override
	public double[] getArrayOfSides() {
		double[] sides = {side, side, side, side};
		return sides;
	}


}
