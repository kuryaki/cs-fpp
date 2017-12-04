package prog3;

import prog3.good.Polygon;

public class Test2 {

	public static void main(String[] args) {
		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 4) };
		// compute areas
		for (ClosedCurve cc : objects) {
			String className = cc.getClass().getSimpleName();
			int sides = ((Polygon) cc).getNumberOfSides();
			double perimeter = ((Polygon) cc).computePermiters();
			
			System.out.println("For this " + className);
			System.out.println("  Number of sides = " + sides);
			System.out.println("  Perimeter = " + perimeter);
		}

	}

}
