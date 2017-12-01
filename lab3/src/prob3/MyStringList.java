package prob3;

public class MyStringList {
	private final int INITIAL_LENGTH = 2;
	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}

	public void add(String s) {
		if (size == strArray.length) {
			resize();
		}
		strArray[size] = s;
		size++;
	}

	public String get(int i) {
		if (i > 0 && i < strArray.length) {

			return strArray[i];
		}
		return null;
	}

	public boolean find(String s) {

		boolean found = false;
		for (String str : strArray) {
			if (str.equals(s)) {
				found = true;
				break;
			}

		}
		return found;
	}

	public void insert(String s, int pos) {
		if (size == strArray.length) {
			resize();
		}
		System.arraycopy(strArray, pos, strArray, pos + 1, size - pos);
		strArray[pos] = s;
		size++;
	}

	public boolean remove(String s) {

		boolean found = false;

		int i = 1;
		for (String str : strArray) {
			if (str.equals(s)) {
				found = true;
				System.arraycopy(strArray, i, strArray, i - 1, size - i);
				size--;
				break;
			}
			i++;

		}

		return found;
	}

	private void resize() {

		String[] newStrArray = new String[size * 2];

		System.arraycopy(strArray, 0, newStrArray, 0, size);

		strArray = newStrArray;
		System.out.println("Resizing...");
	}

	public String toString() {

		String print = "[";

		for (int i = 0; i < size; i++) {
			print += strArray[i] + ",";
		}

		if (size > 0) {
			print = print.substring(0, print.length() - 1);
		}

		print += "]";

		return print;
	}

	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.insert("Richard", 3);
		System.out.println("The list of size " + l.size() + " after inserting Richard into pos 3 is " + l);
		l.insert("Tonya", 0);
		System.out.println("The list of size " + l.size() + " after inserting Tonya into pos 0 is " + l);
	}

}
