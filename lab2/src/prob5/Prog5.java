package prob5;

import java.util.Scanner;

public class Prog5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Word: ");
		
		String word = sc.nextLine();
		
		for (int i = word.length()-1; i >= 0; i--) {
			System.out.print(word.charAt(i));
		}
		
		
		sc.close();  //don’t forget to close

	}

}
