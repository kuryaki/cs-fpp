package prob4;

public class MainLambda {

	public static void main(String[] args) {
		String[] strings = { "Hello", "World", "From", "Maharishi", "University" };
		StringSort myStringSort = new StringSort((String s1, String s2) -> {
			return s1.compareTo(s2);
		});
		
		String result[] = myStringSort.stringSort(strings);
		
		for(String s: result) {
			System.out.println(s);
		}

	}

}
