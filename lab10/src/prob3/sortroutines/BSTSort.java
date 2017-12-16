package prob3.sortroutines;

import prob3.runtime.Sorter;

public class BSTSort extends Sorter {
	
	MyBST mybst = new MyBST();

	@Override
	public int[] sort(int[] arr) {
		mybst.insertAll(arr);
		return mybst.readIntoArray();
	}

}
