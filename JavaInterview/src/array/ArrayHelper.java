package array;

public class ArrayHelper {


	// Print array
	public static void printArray(int[] anyArray) {
		for (int i=0 ; i< anyArray.length ; i++) {
			System.out.println(anyArray[i]);
		}		
	}

	public void findIndexOfSpecificValue(int[] anyArray,int valueToSearch) {
		int index=-1;
		for (int i=0 ; i< anyArray.length ; i++) {
			if(anyArray[i]==valueToSearch)
				index=i;
			    break;
		}		
		System.out.println(index);
	}


	public static void swap(String[] array, int i, int j) {
		String tmp = array[i];
		array[i] = array[j];
		array[j] =tmp;
	}

	public static void swap(int[] array, int i, int j) {
		int tmp = array[i];
		array[i] = array[j];
		array[j] =tmp;
	}


	
	
}
