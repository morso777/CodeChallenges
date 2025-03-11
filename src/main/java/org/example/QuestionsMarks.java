package org.example;

import java.util.Scanner;

public class QuestionsMarks {

    /*
Questions Marks

Have the function QuestionsMarks(str) take the str string parameter, which will contain single digit numbers, letters,
and question marks, and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
If so, then your program should return the string true, otherwise it should return the string false.
If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly 3 question marks between 6 and 4,
and 3 question marks between 5 and 5 at the end of the string.

input: "arrb6???4xxbl5???eee5"
output: true

*/
    public static String QuestionsMarks(String str) {
        boolean validPairFound = false;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                int num1 = Character.getNumericValue(str.charAt(i));
                int questionMarksCount = 0;

                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) == '?') {
                        questionMarksCount++;
                    } else if (Character.isDigit(str.charAt(j))) {
                        int num2 = Character.getNumericValue(str.charAt(j));
                        if (num1 + num2 == 10) {
                            if (questionMarksCount != 3) {
                                return "false";
                            }
                            validPairFound = true;
                        }
                        break;
                    }
                }
            }
        }
        return validPairFound ? "true" : "false";
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print(QuestionsMarks(s.nextLine()));
    }

}
