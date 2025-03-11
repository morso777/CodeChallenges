package org.example;

/*Java program to validate a password is valid if accomplish the below statements

a) It is betwen 6-20 char
b)

example:
input: Clave123#$%
expected ouput: true
*/

import java.util.Scanner;

public class StrongPassword {

            static boolean isValidPassword(String s) {
            //check if the string given is between 6-20 characters

            if (s.length() < 6 || s.length() > 20) {
                System.out.println("invalid password");
                return false;
            }

            // boolean flags
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasdigit = false;
            boolean hasSpecialChar = false;

            //iterate the string
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isUpperCase(ch)) {
                    hasUpperCase = true;
                }
                if (Character.isLowerCase(ch)) {
                    hasLowerCase = true;
                }
                if (Character.isDigit(ch)) {
                    hasdigit = true;
                }
                if (!Character.isLetter(ch) && !Character.isDigit(ch) && !Character.isWhitespace(ch)) {
                    hasSpecialChar = true;
                }
            }
            return (hasUpperCase && hasLowerCase && hasdigit && hasSpecialChar);
        }

        public static void main(String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.println(isValidPassword(s.nextLine()));
        }
    }




