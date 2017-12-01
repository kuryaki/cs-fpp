package prob4;

public class Main {

	public static void main(String[] args) {

		Circle circle = new Circle(20);

		System.out.println("Area of circle is " + circle.area());

		Rectangle rectangle = new Rectangle(20, 15);

		System.out.println("Area of rectangle is " + rectangle.area());

		Triangle triangle = new Triangle(20, 10);

		System.out.println("Area of triangle is " + triangle.area());

	}

}
