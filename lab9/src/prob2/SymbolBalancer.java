package prob2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SymbolBalancer {
	String ODD_DELIMITER = "" + (char) 0;
	String filename;
	String text;

	public SymbolBalancer(String filename) {
		this.filename = filename;
		readFile();
	}

	public String getText() {
		return text;
	}

	boolean symbolsBalanced(String delimiters) {

		Stack<Character> myStack = new Stack<Character>();

		for(char c: text.toCharArray()) {
			int index = delimiters.indexOf(c);
			if(index%2 == 0) {
				myStack.push(c);
			}
			if(index%2 == 1) {
				if(myStack.isEmpty()) {
					return false;
				}
				char popped = myStack.pop();
				char closing = delimiters.charAt(index-1);
				if(popped != closing) {
					return false;
				}
			}
		}
		
		return true;

	}

	public static void main(String[] args) {
		SymbolBalancer sb = new SymbolBalancer("Employee.java");
		System.out.println(sb.getText());
		System.out.println(sb.symbolsBalanced("[]{}<>()||"));
	}

	void readFile() {
		try {

			BufferedReader br = new BufferedReader(new FileReader(filename));
			String currentLine;
			StringBuilder builder = new StringBuilder();

			while ((currentLine = br.readLine()) != null) {
				builder.append(currentLine);
			}
			
			text = builder.toString();
			br.close();

//			Scanner sc = new Scanner(new File(filename));
//			sc.useDelimiter(ODD_DELIMITER);
//			text = sc.next();
//			sc.close();
//			System.out.println(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
