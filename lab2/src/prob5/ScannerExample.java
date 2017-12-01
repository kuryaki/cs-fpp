package prob5;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Type your name: ");
		System.out.println("you wrote: " + sc.nextLine());
		System.out.print("Type your age: ");
		System.out.println("your age: " + sc.nextInt());
		sc.close();  //don’t forget to close 

	}
	
	

}
