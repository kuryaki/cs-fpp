package lesson6_moreanonymous;
import java.util.*;
public class MainSort {

	public static void main(String[] args) {
		Employee[] emps = {new Employee("Bob", 200000),
				new Employee("Anne", 150000),
				new Employee("Steve", 155000)};
		
		Arrays.sort(emps, new NameComparator());
		System.out.println(Arrays.toString(emps));
		
		Arrays.sort(emps, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(Arrays.toString(emps));
		
		//using lambdas
		Arrays.sort(emps, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		System.out.println(Arrays.toString(emps));
	}

}
