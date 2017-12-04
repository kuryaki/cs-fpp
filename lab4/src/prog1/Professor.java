package prog1;

import java.time.LocalDate;

public class Professor extends DeptEmployee {
	
	private int numberOfPublications;
	
	public Professor(double salary, String name, LocalDate hireDate, int numberOfPublications) {
		super(salary, name, hireDate);
		this.numberOfPublications = numberOfPublications;
	}


	public int getNumberOfPublications() {
		return numberOfPublications;
	}

	public void setNumberOfPublications(int numberOfPublications) {
		this.numberOfPublications = numberOfPublications;
	}

}
