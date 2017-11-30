package prob6;

/**
 * Do not use words with ','
 * @author kuryaki
 *
 */
public class Prog6 {
	
	private static boolean contains (String[] filtered, String word) {
		
		boolean exists = false;
		
		for(String test : filtered) {
			
			if(test.equals(word)) {
				exists = true;
				break;
			}
			
		}
		
		return exists;
		
	}
	
	public static String[] removeDups(String[] words) {
		
		String index = words[0];
		
		for(int i = 1; i < words.length; i++) {
			
			if(!contains(index.split(","), words[i])) {
				index = index + "," + words[i];
			}
			
		}
	
		return index.split(",");
	}


}
