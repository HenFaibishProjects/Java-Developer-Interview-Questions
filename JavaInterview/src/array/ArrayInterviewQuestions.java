package array;

import java.util.*;

public class ArrayInterviewQuestions {

	public static BubbleSort bubbleSort = new BubbleSort();

	//How to find the missing number in integer array of 1 to 100? 
	public static Integer findMissingNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (!(array[i] + 1 == (array[i + 1]))) {
				return new Integer(array[i]);
			}
		}
		return null;
	}

	//  How to find duplicate number on Integer array in Java?
	public static Integer findDuplicateNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i])
					return new Integer(array[i]);
			}
		}
		return null;
	}

	//How to check if array contains a number in Java?
	public static boolean findIfArrayContainsNumber(String[] array) {
		boolean containNumbers = false;
		for (int i = 0; i < array.length; i++) {
			int j = 0;
			while (j < 10) {
				String str = Integer.toString(j);
				if (array[i].contains(str)) {
					containNumbers = true;
					break;
				}
				j++;
			}
		}
		return containNumbers;
	}

	//How to find largest and smallest number in unsorted array?
	public static void findLargestAndSmallest(int[] array) {
		int smallest = 0;
		int largest = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					smallest = array[j];
				}
				if (array[j] > array[i]) {
					largest = array[j];
				}
			}
		}
		System.out.println("largest is: " + largest + "  Smallest is: " + smallest);
	}

	//How to find all pairs on integer array whose sum is equal to given number?
	public static void findAllPairsEqualToSum(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if ((array[j] + array[i]) == sum) {
					System.out.println(array[j] + " " + array[i]);
				}
			}
		}
	}

	//Write a program to remove duplicates from array in Java?
	public static void removeDuplicateNumber(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i])
					while (j < array.length - 1) {
						array[j] = array[j + 1];
						j++;
					}
			}
		}
		array = Arrays.copyOf(array, array.length - 1);
		SimpleArray.printArray(array);
	}

	//There is an array with every element repeated twice except one. Find that element?
	public static void everyElementRepeatedTwiceExceptOne(int[] array) {
		List<Integer> tmpList = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					tmpList.add(j);
					tmpList.add(i);
				}
			}
		}
		Collections.sort(tmpList);
		for (int i = 0; i < tmpList.size() - 1; i++) {
			if (tmpList.get(i) + 1 != tmpList.get(i + 1)) {
				System.out.println(i + 1);
			}
		}
	}

	//How to find smallest element in unsorted array?
	public static int findSmallestElementInUnsorted(int[] array) {
		int smalles = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < smalles)
				smalles = array[i];
		}
		return smalles;
	}

	//How to find most common element in array? - NOT WORKING WELL !!!!!
	public static void findMostCommonElement(int[] array) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		for (int i : array) {
			Integer count = myMap.get(i);
			myMap.put(i, count != null ? count + 1 : 0);
		}

		Map.Entry<Integer, Integer> firstEntry = myMap.entrySet().iterator().next();
		int largestKey = firstEntry.getKey();
		Integer largestKeyValue = firstEntry.getValue();

		for (Map.Entry<Integer, Integer> map : myMap.entrySet()) {
			int value = map.getValue();
			if (value > largestKeyValue) {
				largestKey = value;
				//largestKeyValue = map.getValue();
			}
		}
		System.out.println("Largest Key       : " + largestKey);
	}

	//How find the first repeating element in an array of integers?
	public static int findTheFirstRepeatingElement(int[] array) {
		int tmp = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] == array[i]) {
					tmp = array[j];
					break;
				}
			}
		}
		return tmp;
	}

	//How to reverse array in place in Java?
	public static void reverseArray(int[] array) {
		int tmpa;
		for (int i = 0; i < array.length / 2; i++) {
			tmpa = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = tmpa;
		}
		System.out.println(array[1]);
	}

	//How to find first non-repeating element in array of integers?
	public static int findTheFirstNoneRepeatingElement(int[] array) {
		boolean flagForRepeatingElements = false;
		Integer tmp = null;
		for (int i = 0; i < array.length; i++) {
			flagForRepeatingElements = false;
			for (int j = 0; j < array.length; j++) {
				if (j == i) continue;
				if (array[j] == array[i]) {
					flagForRepeatingElements = true;
					break;
				}
			}
			if (!flagForRepeatingElements) {
				tmp = array[i];
				break;
			}
		}
		return tmp;

	}

	//How to find top two numbers from an integer array
	public static void findTopTwoNumbers(int[] array) {
		Integer firstTopMaxNumber = null;
		Integer tmp = null;
		int SecondTopMaxNumber = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[i]) {
					firstTopMaxNumber = array[j];
					tmp = j;
				}
			}
		}
		for (int k = 0; k < array.length; k++) {
			for (int l = k + 1; l < array.length; l++) {
				if (l == tmp) continue;
				if (array[l] > array[k]) {
					SecondTopMaxNumber = array[l];
				}
			}
		}
		System.out.println(firstTopMaxNumber);
		System.out.println(SecondTopMaxNumber);
	}

	//How to find the smallest positive integer value
	public static void findTheSmallestPsitiveInt(int[] array) {
		Integer tmp = null;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > 0) {
				tmp = array[i];
				break;
			}
		}
		for (int j = 0; j < array.length; j++) {
			if (array[j] > 0 && array[j] < tmp)
				tmp = array[j];
		}
		System.out.println(tmp);
	}

	//	How to rearrange array in alternating positive and negative number? (
	public static void rearrangeArrayInAlternatingPositiveAndNegative(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (i != array.length) {
					if (array[j] == array[i] * (-1)) {
						int tmp = array[j];
						array[j] = array[i + 1];
						array[i + 1] = tmp;
						if (array[i] > array[i + 1]) {
							tmp = array[i + 1];
							array[i + 1] = array[i];
							array[i] = tmp;
						}
					}
				}
		}
		SimpleArray.printArray(array);
	}

	// How to find if there is a sub array with sum equal to zero? 
	public static boolean FindIfThereIsASubArrayWithSumEqualToZero(int[] array) {
		boolean thereIsASubArray = false;
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = 0;
			for (int j = i + 1; j < array.length; j++)
				sum = sum + array[j];
			if (sum == 0) {
				thereIsASubArray = true;
				break;
			}
		}
		return thereIsASubArray;
	}

	// How to merge sorted array?  
	public static void mergeArray(int[] array1, int[] array2) {
		int[] array3 = new int[array1.length + array2.length + 1];
		int k = 0;
		for (int i = 0; i < array1.length; i++, k++) {
			array3[k] = array1[i];
		}
		k++;
		for (int j = 0; j < array2.length; j++, k++) {
			array3[k] = array2[j];
		}

		for (int i = 0; i < array3.length - 1; i++) {
			for (int j = i + 1; j < array3.length - 1; j++) {
				if (array3[i] > array3[j]) {
					int tmp = array3[i];
					array3[i] = array3[j];
					array3[j] = tmp;
				}

			}
		}
		SimpleArray.printArray(array3);
	}

	// How to find minimum value in a rotated sorted array?
	public static int findMinimumValueInRotatedSortedArray(int[] array1) {
		int low = 0;
		int hight = array1.length - 1;
		int mid;
		while (array1[low] > array1[hight]) {
			mid = (low + hight) / 2;
			if (array1[mid] > array1[hight]) {
				low = mid + 1;
			} else {
				hight = mid;
			}
		}
		return array1[low];
	}

	// ccolors balls 1.Yello 2.Red 3.Blue
	public static void colorBalls(String[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j].equals("b")) {
					SimpleArray.swap(array, i, j);
				}
				if (array[j].equals("r")) {
					SimpleArray.swap(array, i, j);
				}
				if (array[j].equals("y")) {
					SimpleArray.swap(array, i, j);
				}
			}
		}
	}

	// How to sortby modle 2,4,6,8.
	public static void sortByModle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (!(array[j] % 3 == 1)) {
					SimpleArray.swap(array, i, j);
				}

				if (!(array[j] % 2 == 1)) {
					SimpleArray.swap(array, i, j);
				}

			}
		}

	}

	// return random song from array , do not repeat songs in same week
	public static void returnRandEchTimeAnother(int[] array) {
		int daysOfTheWeekTmp = 0;
		Map<Integer, Boolean> weeklySonglist = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			weeklySonglist.put(array[i], false);
		}
		while (daysOfTheWeekTmp < 7) {
			int arrayLength = array.length;
			Random r = new Random();
			int tmp = r.nextInt((arrayLength));
			if (!(weeklySonglist.get(array[tmp]))) {
				System.out.print(array[tmp] + " ");
				daysOfTheWeekTmp++;
				weeklySonglist.put(array[tmp], true);
			}

		}

	}


	//	How do you find the missing number in a given integer array of 1 to 100?
	public static Integer missingNumberInArry(int[] array) {
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			if (!(array[i] == array[i + 1] + 1)) {
				return array[i];
			}
		}
		return null;
	}



//	How do you find duplicate numbers in an array if it contains multiple duplicates?
public static int[] returnMoreThanOneDuplicateNumbers(int[] array) {
	int[] newArray = new int[array.length / 2];
	int startIndexNewArray = 0;
	for (int i = 0; i < array.length; i++) {
		for (int j = i + 1; j < array.length; j++) {
			if (array[i] == array[j]) {
				newArray[startIndexNewArray] = array[j];
				startIndexNewArray++;
			}
		}
	}
	return newArray;
}


	}
