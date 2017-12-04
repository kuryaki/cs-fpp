package prog1;

import java.time.LocalDate;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		DeptEmployee prof1 = new Professor(75000, "Henry Packard", LocalDate.of(2009, 11, 12), 10);
		DeptEmployee prof2 = new Professor(80000, "Jimmy Roncancio", LocalDate.of(2010, 10, 4), 10);
		DeptEmployee prof3 = new Professor(85000, "Alessa Shang", LocalDate.of(2007, 8, 8), 10);
		
		DeptEmployee secr1 = new Secretary(70000, "Janet Suzzane", LocalDate.of(2011, 7, 25), 200);
		DeptEmployee secr2 = new Secretary(70000, "Teresa Lobstein", LocalDate.of(2013, 9, 14), 200);
		
		
		DeptEmployee[] department = { prof1, prof2, prof3, secr1, secr2 };
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("See the sum of all salaries? (y/n) ");
		String answer = sc.next();
		
		if(answer.equalsIgnoreCase("y")) {
			int totalSalaries = 0;
			
			for(DeptEmployee employee : department) {
				totalSalaries += employee.computeSalary();
			}
			
			System.out.println("Total: " + totalSalaries);
		}
		
	}

}
