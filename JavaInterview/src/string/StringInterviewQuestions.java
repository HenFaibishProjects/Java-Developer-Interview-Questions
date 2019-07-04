package string;

import java.lang.String;
import java.util.Arrays;

public class StringInterviewQuestions {
    private Integer anInt;
    private String a;
    private StringBuffer ab;
    private StringBuilder abc;

// create String object
    public static char[] createString(char[] chars) {
        return Arrays.copyOf(chars, chars.length);
    }

	
//				1) How to Print duplicate characters from String? 
//				2) How to check if two Strings are anagrams of each other? 
//				3) How to program to print first non repeated character from String? 
//				4) How to reverse String in Java using Iteration and Recursion? 
//				5) How to check if a String contains only digits?  
//				6) How to find duplicate characters in a String? 
//				7) How to count number of vowels and consonants in a String? 
//				8) How to count occurrence of a given character in String? 
//				9) How to convert numeric String to an int? 
//				10) How to replace each given character to other e.g. blank with %20? 
//				11) How to find all permutations of String? 
//				12) How to reverse words in a sentence without using library method? 
//				13) How to check if String is Palindrome?
//				14) How to remove duplicate characters from String? 
//				15) How to check if a String is valid shuffle of two String? 
//				16) Write a program to check if a String contains another String e.g. indexOf()? 
//				17) How  to return highest occurred character in a String? 
//				18) Write a program to remove a given characters from String? 
//				19) Write a program to find longest palindrome in a string? 
//	            20) How to sort String on their length in Java? 
//		        1) Is String a keyword in java?
//				2) Is String a primitive type or derived type?
//				3) In how many ways you can create string objects in java?
//				4) What is string constant pool?
//				5) What is special about string objects as compared to objects of other derived types?
//				6) What do you mean by mutable and immutable objects?
//				7) Which is the final class in these three classes � String, StringBuffer and StringBuilder?
//				8) What is the difference between String, StringBuffer and StringBuilder?
//				9) Why StringBuffer and StringBuilder classes are introduced in java when there already exist String class to represent the set of characters?
//				10) How many objects will be created in the following code and where they will be stored in the memory?
//				11) How do you create mutable string objects?
//				12) Which one will you prefer among �==� and equals() method to compare two string objects?
//				13) Which class will you recommend among String, StringBuffer and StringBuilder classes if I want mutable and thread safe objects?
//				14) How do you convert given string to char array?
//				15) How many objects will be created in the following code and where they will be stored?	
//				16) Where exactly string constant pool is located in the memory?	
//				17) I am performing lots of string concatenation and string modification in my code. which class among string, StringBuffer and StringBuilder improves the performance of my code. Remember I also want thread safe code?
//				18) What is string intern?
//				19) What is the main difference between Java strings and C, C++ strings?
//				20) How many objects will be created in the following code and where they will be stored?
//				21) Can we call String class methods using string literals?
//				23) What do you think about string constant pool? Why they have provided this pool as we can store string objects in the heap memory itself?
//				24) What is the similarity and difference between String and StringBuffer class?
//				25) What is the similarity and difference between StringBuffer and StringBuilder class?
//				26) How do you count the number of occurrences of each character in a string?

                 //How do you remove all white spaces from a string in java?
                       public String removeWhiteSpacesFromString(String st) {
                           return st.replaceAll(" ","");
                       }

//				28) How do you find duplicate characters in a string?
                        public int duplicateCharactersInString(String s) {
                            int distinct = 0;
                            for (int i = 0; i < s.length(); i++) {
                                for (int j = 0; j < s.length(); j++) {
                                    if (s.charAt(i) == s.charAt(j)) {
                                        distinct++;
                                    }
                                }
                            }
                            return distinct;
                        }



//				29)  Write a java program to reverse a string?

                        public String reverseString(String s) {
                            StringBuilder result = new StringBuilder();
                            for (int i = s.length(); i > 0; i--) {
                                result.append(s.charAt(i - 1));
                            }
                            return String.valueOf(result);
                        }
//				31) Write a java program to reverse a given string with preserving the position of spaces?

                            public String reverseStringPreservingSpaces(String str){
                                StringBuffer sb = new StringBuffer(str);
                                sb.reverse();
                                for(int i=0 ; i<str.length(); i++){
                                    if(str.charAt(i)== ' '){
                                        sb.insert(i, " ");
                                    }
                                }
                                return String.valueOf(sb);
                            }
//				 How do you convert string to integer and integer to string in java?

                         public void convert(int it ,String str){
                              int convertedInt = Integer.valueOf(str);
                              String ConvertedString = String.valueOf(it);
                         }
//				33) Write a code to prove that strings are immutable in java?
                            public void proveStringsImmutable(){
                                String a = "aa";
                                int aHushBeforeChange = a.hashCode();
                                a = "bb";
                                int aHushAfterChange = a.hashCode();
                                if (aHushBeforeChange!=aHushAfterChange)
                                    System.out.print("strings are immutable in java");
                                else
                                    System.out.print("strings are mutable in java");
                            }
//				34) Write a code to check whether one string is a rotation of another?
//				35) Write a java program to reverse each word of a given string?	

}