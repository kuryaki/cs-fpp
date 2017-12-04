package prog4;

import prog4.good.Polygon;

public class Test3 {

	public static void main(String[] args) {
		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Rectangle(3, 4) };
		// compute areas
		for (ClosedCurve cc : objects) {
			String className = cc.getClass().getSimpleName();
			double perimeter = ((Polygon) cc).computePermiter();
			
			System.out.println("For this " + className);
			System.out.println("  Perimeter = " + perimeter);
		}

	}

}
