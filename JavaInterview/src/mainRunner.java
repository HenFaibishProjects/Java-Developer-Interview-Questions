import array.ArrayHelper;
import array.ArrayInterviewQuestions;
import trickQuestionWhatisTheOutput.ClassForOutput;

public class mainRunner {
    public static int[] intArray;
    public static String[] arrayColors;
    public static Integer[] integerArray;
    public static Double[] doubleArray ;
    public static Character[] characterArray ;


    public static void init() {
        intArray = new int[]{2, 7, 22, 6, 3, 8, 12};
        arrayColors = new String[]{"y", "r", "b","c", "b", "y", "b", "r", "y"};
        integerArray = new Integer[]{ 1, 2, 3, 4, 5, 6 };
        doubleArray = new Double[]{ 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7 };
        characterArray = new Character[]{ 'H', 'E', 'L', 'L', 'O' };
    }

    public static void main(String args[]) {
        init();
//        ArrayInterviewQuestions.colorBalls1(arrayColors);
//        ArrayHelper.printArray(arrayColors);
        ClassForOutput.printit13();
    }

}
