package prob1;

public class MyTable {
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s){
		//inserts the entry (c, s) into the table
		//by computing proper array index for c
	}
	public String get(char c){
		//returns the string in Entry table whose index
		//corresponds to the char c
		return null;
	}
	
	public String toString() {
		return "";
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		//..System.out.println(t.get('b'));
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;

		//implement
		
		
	}
	

}
