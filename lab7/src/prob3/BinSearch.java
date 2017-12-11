package prob3;

public class BinSearch {

	public static boolean search(String source, char c) {
		
		int len = source.length();
		int m = len/2;
		
		char ch = source.charAt(m);
		
		if(source == null || len <= 1) return false;
		if(ch == c) return true;
		if(c < ch) return search(source.substring(0, m), c);
		if(c > ch) return search(source.substring(m, len), c);
		
		return false;
	}

}
