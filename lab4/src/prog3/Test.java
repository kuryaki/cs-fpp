package prog3;

public class Test {

	public static void main(String[] args) {

		ClosedCurve[] objects = { new Triangle(4, 5, 6), new Square(3), new Circle(3), new Rectangle(3, 7) };
		// compute areas
		for (ClosedCurve cc : objects) {
			double area = cc.computeArea();
			String className = cc.getClass().getSimpleName();
			System.out.println("The area of this " + className + " is " + area);

		}

	}

}