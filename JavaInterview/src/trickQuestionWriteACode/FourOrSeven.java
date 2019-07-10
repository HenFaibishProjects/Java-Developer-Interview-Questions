package trickQuestionWriteACode;

import java.util.HashMap;

/*
write any variation as you can for this demand :
function that get int (4 or 7)

* when the function get 4 it return 7
* when the function get 7 it return 4
* what input is verified 4 or 7

 */

public class FourOrSeven {

    public int fOSIf(int x) {
        if (x == 4)
            return 7;
        return 4;
    }

    public int fOSSwich(int x) {
        int tmp = 0;
        switch (x) {
            case 4:
                tmp = 7;
                break;
            case 7:
                tmp = 4;
                break;
        }
        return tmp;
    }

    public int fOSMath(int x) {
        return 11 - x;
        // return 28/x;
    }

    public int fOSWhile(int x) {
        int tmp = 0;
        while (x==7) {
           tmp = 4;
           x++;
        }

        while (x==4) {
            tmp = 7;
            x++;
        }

        return  x;

    }

    public int fOSHash(int x) {
        HashMap<Integer, Integer> newHash = new HashMap<>();
        newHash.put(4, 7);
        newHash.put(7, 4);
       return newHash.get(x);
    }
}