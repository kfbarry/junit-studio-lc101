package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class BalancedBrackets {
    /**
     * The function BalancedBrackets should return true if and only if
     * the input string has a set of "balanced" brackets.
     *
     * That is, whether it consists entirely of pairs of opening/closing
     * brackets (in that order), none of which mis-nest. We consider a bracket
     * to be square-brackets: [ or ].
     *
     * The string may contain non-bracket characters as well.
     *
     * These strings have balanced brackets:
     *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
     *
     * While these do not:
     *   "[LaunchCode", "Launch]Code[", "[", "]["
     *
     * @param str - to be validated
     * @return true if balanced, false otherwise
     */
    public static boolean hasBalancedBrackets(String str) {

        ArrayList<Integer>  binaryBracketCounter = new ArrayList<>();
        if (!str.contains("[") || !str.contains("]")) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == '[') {
                binaryBracketCounter.add(0);
            } else if (ch == ']') {
                binaryBracketCounter.add(1);
            }
        }

        for (int i = 0; i < binaryBracketCounter.size()-1; i++){
            if (binaryBracketCounter.get(i) + binaryBracketCounter.get(i+1) != 1){
                return false;
            } else if (binaryBracketCounter.get(0) != 0){
                return false;
            }
        }

        return true;
    }

}



// alternative method that didn't quite work
//        int counter = -1;
//        ArrayList<Integer> leftBrackets = new ArrayList<>();
//        ArrayList<Integer> rightBrackets = new ArrayList<>();

//        for (char ch : str.toCharArray()) {
//            counter = counter + 1;
//            if (ch == '[') {
//                leftBrackets.add(counter);
//            } else if (ch == ']') {
//                rightBrackets.add(counter);
//            }
//        }
//
//        if (leftBrackets.size() != rightBrackets.size()){
//            return false;
//        }
//
//        for (int i = 0; i < leftBrackets.size()-1; i++){
//            int testInt = i + 1;
//            if (rightBrackets.get(i) < leftBrackets.get(i) || rightBrackets.get(testInt) < leftBrackets.get(testInt)){
//                return false;
//            } else if (rightBrackets.get(i) > leftBrackets.get(testInt)){
//                return false;
//            }
//        }