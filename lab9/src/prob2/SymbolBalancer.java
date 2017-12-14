package prob2;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = ""+(char)0;
	String filename;
	String text;
	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}
	public String getText() {
		return text;
	}

	boolean symbolsBalanced(String delimiters){
		//TODO: implement this method
		return false;

	}
	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("Employee.java");
		System.out.println(sb.getText());
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
	}
	void readFile() {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(ODD_DELIMITER);
			text = sc.next();
			System.out.println(text);
			sc.close();
		}
		catch(FileNotFoundException ex) {
			System.err.println("File Not Found Exception "+ex.getMessage());
		}
	}

}



