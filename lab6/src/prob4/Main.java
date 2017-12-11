package prob4;

public class Main {

	public static void main(String[] args) {
		String[] strings = { "Hello", "World", "From", "Maharishi", "University" };
		StringSort myStringSort = new StringSort(new StringSort.LengthCompare());
		
		String result[] = myStringSort.stringSort(strings);
		
		for(String s: result) {
			System.out.println(s);
		}

	}

}
