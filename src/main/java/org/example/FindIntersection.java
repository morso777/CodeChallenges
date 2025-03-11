package org.example;

import java.util.Scanner;

public class FindIntersection {

    /*coderbyte
    "Find Intersection"
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
the first element will represent a list of comma-separated numbers sorted in ascending order, the second element
will represent a second list of comma-separated numbers (also sorted). Your goal is to return a comma-separated
string containing the numbers that occur in elements of strArr in sorted order. If there is no intersection,
return the string false

input :  new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
outputexpected:  1,4,13
 */
    public static String FindIntersection(String[] strArr) {

        String str1 = strArr[0];
        String str2 = strArr[1];
        String result = "";
        for(String chk: str1.split(", ")){
            for(String chk2: str2.split(", ")){
                if(chk.equals(chk2)){
                    if(result.length()==0){
                        result+=chk;
                    }
                    else {
                        result+=","+chk;
                    }
                }
            }
        }
        if(result.isEmpty())
            return "false";
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection(new String[]{s.nextLine()}));
    }
}
