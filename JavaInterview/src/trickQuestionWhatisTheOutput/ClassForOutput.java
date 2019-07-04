package trickQuestionWhatisTheOutput;

import java.util.Arrays;

public class ClassForOutput {


    public static void prinit1() {
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
    }
    /* Answer: This question is tricky because unlike the Integer, where MIN_VALUE is negative,
     both the MAX_VALUE and MIN_VALUE of the Double class are positive numbers.
      The Double.MIN_VALUE is 2^(-1074), a double constant whose magnitude is the
      least among all double values. So unlike the obvious answer,
      this program will print 0.0 because Double.MIN_VALUE is greater than 0.
      */



        public static void prinit2() throws Exception {
            char[] chars = new char[] {'\u0097'};
            String str = new String(chars);
            byte[] bytes = str.getBytes();
            System.out.println(Arrays.toString(bytes));
        }
/*
  Answer: The trickiness of this question lies on character encoding and how String to byte array conversion works.
  In this program, we are first creating a String from a character array,
  which just has one character '\u0097', after that we are getting the byte array from that
  String and printing that byte. Since \u0097 is within the 8-bit range of byte primitive type,
  it is reasonable to guess that the str.getBytes() call will return a byte array that contains
  one element with a value of -105 ((byte) 0x97).

However, that's not what the program prints and that's why this question is tricky.
As a matter of fact, the output of the program is operating system and locale dependent.
On a Windows XP with the US locale, the above program prints [63],
if you run this program on Linux or Solaris, you will get different values.
 */



    public static void printit3() {
        String str = "Automation";
        StringBuilder str2 = new StringBuilder();
        str2.append(str);
        str2 = str2.reverse();
        System.out.println(str2);
    }
        /*
        Output:
        noitamotuA
         */

        public static void printit4() {
            String str = "Saket Saurav";
            char chars[] = str.toCharArray();  // converted to character array and printed in reverse order
            for(int i= chars.length-1; i>=0; i--) {
                System.out.print(chars[i]);
            }
        }
            /*
            Output:
             varuaS tekaS
             */


    public static void printit5(){
        System.out.print('A' + 'B');
    }
     // 131

    public static void printit6(){
        System.out.print("A" + "B" + 'A');
        }
        //ABA

    public static void printit7(){
        System.out.print(20+ 1.34f + "A" + "B");
        }
        //21.34AB

    public static void printit8() {
        char [] str={'i','n','c','l','u','d','e','h','e','l','p'};
        System.out.println(str.toString());
        }
        // [C@19e0bfd (Memory Address)

    public static void printit9() {
        System.out.print("Hello");
        System.out.println("Guys!");
        }

        //HelloGuys!


    public static void printit10() {
        char a=0x41;    //Unicode of 'A'
        char b=0x42;    //Unicode of 'B'

        System.out.print(a+"" + b+"");
        System.out.print("-");
        System.out.print(a+b);
        }
        // AB-131






























}









