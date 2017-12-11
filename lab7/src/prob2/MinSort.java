package prob2;

import java.util.Arrays;

public class MinSort {
	
	private static String store = "";
	
	public static void main(String[] args) {
		
		MinSort ms = new MinSort();
		
		String original = "zwxuabfkafutbbb";
		
		String res = ms.sort(original);
		String res2 = ms.mySort(original);
		
		System.out.println(original);
		System.out.println("Recursive Sort: " + res);
		System.out.println("Array Sort: " + res2);
	}

	
	private String sort(String string) {
		
		if (string == null || string.length() < 1) {
			return store;
		}

		int minpos = minPos(string);
		string = swap(0, minpos, string);
		store += string.charAt(0);
		return sort(string.substring(1));
	}
	
	private String swap(int i, int minpos, String s) {
		char[] arr = s.toCharArray();
		char temp = arr[minpos];
		arr[minpos] = arr[0];
		arr[0] = temp;
		
		return (new StringBuilder()).append(arr).toString();
	}


	private int minPos(String s) {
		int minpos = 0;
		int length = s.length();
		
		for(int i = 1; i < length; i++) {
			if((s.charAt(i) - 'a') <= (s.charAt(minpos) - 'a')) {
				minpos = i;
			}
		}
		
		return minpos;
	};


	private String mySort(String string) {
		
		String chars[] = string.split("");
		Arrays.sort(chars);

		return String.join("", chars);
	}
	
	

}
