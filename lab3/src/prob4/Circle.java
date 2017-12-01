package prob4;

public final class Circle {
	
	private final double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

}
