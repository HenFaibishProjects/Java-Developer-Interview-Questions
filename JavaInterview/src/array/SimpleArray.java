package array;

public class SimpleArray {

	public int[] intArray1 = new int[5];
	public String[] stringArray = new String[5];
	public int[] intArray2 = new int[5];
	public int[] intOngoingArray = new int[7];
	
	
	public void setArray() {
		intArray1[0] =1;
		intArray1[1] =3;
		intArray1[2] =5;
		intArray1[3] =7;
		intArray1[4] =10;
		
		intArray2[0] =2;
		intArray2[1] =4;
		intArray2[2] =6;
		intArray2[3] =9;
		intArray2[4] =12;
		
		stringArray[0] ="dhj";
		stringArray[1] ="sgf";
		stringArray[2] ="er";
		stringArray[3] ="3";
		stringArray[4] ="er";

	}
	
	
	
	// Print array
	public static void printArray(int[] anyArray) {
		for (int i=0 ; i< anyArray.length ; i++) {
			System.out.println(anyArray[i]);
		}		
	}

    // Find the value 7
	public void findIndexOfSpecificValue(int[] anyArray,int valueToSearch) {
		int index=-1;
		for (int i=0 ; i< anyArray.length ; i++) {
			if(anyArray[i]==valueToSearch)
				index=i;
			    break;
		}		
		System.out.println(index);
	}

	public int[] getIntArray1() {
		return intArray1;
	}



	public void setIntArray1(int[] intArray) {
		this.intArray1= intArray;
	}
	
	public int[] getIntArray2() {
		return intArray2;
	}



	public void setIntArray2(int[] intArray2) {
		this.intArray2= intArray2;
	}
	
    public void overAllArray() {
    	setArray();
    	//findIndexOfSpecificValue(intArray, 7);
    	//printArray(intArray);
    	
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
