package prob1;

public class MyTable {
	Entry[] entries = new Entry[26];
	
	public void add(char c, String s){
		entries[c-'a'] = new Entry(c, s);
	}
	public String get(char c){
		
		return entries[c-'a'].s;
	}
	
	public String toString() {
		String log = "";
		for(Entry e: entries) {
			if (e != null) {
				log += e.toString() + "\n";
			}
		}
		return log;
	}
	

	public static void main(String[] args){
		MyTable t = new MyTable();
		t.add('a', "Andrew");
		t.add('b',"Billy");
		t.add('w',"Willie");
		
//		String s = t.get('b'); 
//		System.out.println(s);
		
		System.out.println(t);
		
	}
	class Entry {
		
		char c;
		String s;

		public Entry(char c, String s) {
			this.c = c;
			this.s = s;
		}
		
		public String toString() {
			return String.valueOf(c) + "->" + s;
		}
		
		
	}
	

}
