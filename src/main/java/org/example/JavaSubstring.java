package org.example;

import java.util.Scanner;
/*
Given a string,s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start  to end -1.
You'll find the String class' substring method helpful in completing this challenge.

Input Format
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end .

Constraints
*  1<_ |s| <_100
* 0<_start <end<_n
*String  s consists of English alphabetic letters (i.e., [a-z A-Z]) only.

Output Format
Print the substring in the inclusive range from start to end -1 .

Sample Input
Helloworld
3 7

Sample Output
lowo

Explanation
In the next example below, the substring is lowo:

0123456789
Helloworld
 */



public class JavaSubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        // Obtener la subcadena y mostrarla
        String result = S.substring(start, end);
        System.out.println(result);
    }

}
