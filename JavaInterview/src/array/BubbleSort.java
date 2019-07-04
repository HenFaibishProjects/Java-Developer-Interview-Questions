package array;

public class BubbleSort {
	/*
	 *  in-palce algorith (we dont create another array)
	 *  O(n^2) complexity
	 */
	
	public void sortByBubble(int[] array) {
		for (int i = 0; i < array.length-1; i++) {
			for (int j=i+1; j<array.length-1; j++) {
				if (array[i]>array[j]) {
					SimpleArray.swap(array, i, j); 
				}
			}
		}

	}


}
