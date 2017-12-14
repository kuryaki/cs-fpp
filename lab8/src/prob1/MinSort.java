package prob1;

import java.util.Arrays;

public class MinSort {
	
	String[] arr;
	
	MinSort(String[] arr){
		this.arr = arr;
	}
	
	public String[] sort(){
		if(arr == null || arr.length <=1) return arr;
		int len = arr.length;
		int temp = 0;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len-1);
			swap(i,nextMinPos); 
		}
		return arr;
		
	}
	
	void swap(int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}
	
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){	
		
		String m = arr[bottom];
		int index = bottom;
		
		for(int i = bottom+1; i <= top; ++i){
			if(arr[i] != null && arr[i].compareTo(m) < 0){ 
				m = arr[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	public static void main(String[] args){
		String[] test = {"ab", "cc", "z", "a",  "e", "zew", "dav"};
		MinSort ss = new MinSort(test);
		ss.sort();
		System.out.println(Arrays.toString(ss.arr));
		
	}
}