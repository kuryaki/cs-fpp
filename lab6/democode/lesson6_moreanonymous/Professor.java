package lesson6_moreanonymous;

public abstract class Professor {

	abstract double getSalary();

	public static void main(String[] args) {
		Professor p = new Professor() {

			@Override
			double getSalary() {
				// TODO Auto-generated method stub
				return 4000;
			}
		};

		System.out.println(p.getClass());
	}
}
