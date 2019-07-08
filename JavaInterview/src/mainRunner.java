import array.ArrayInterviewQuestions;

import java.util.Arrays;

public class mainRunner {


//    public static int[] intArray;
    public static String[] stringArray;

    public static void main(String args[]) {

//        intArray = new int[]{2, 7, 22, 6, 3, 8, 12};
        stringArray = new String[]{"y", "r", "b","c", "b", "y", "b", "r", "y"};
        ArrayInterviewQuestions.colorBalls1(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }

}
