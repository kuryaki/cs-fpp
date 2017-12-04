package prog5;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		Employee[] emps = new Employee[5];
		emps[0] = new Employee("Mike", 5000, 2016, 9, 1);
		emps[1] = new Employee("Mike", 4000, 2016, 9, 1);
		emps[2] = new Employee("Anne", 6000, 2015, 9, 1);
		emps[3] = new Employee("Joe", 5000, 2017, 9, 1);
		emps[4] = new Employee("Anne", 6000, 2016, 9, 1);
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));
	}
}
