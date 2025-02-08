package org.example;

public class ReturnNumbers {



    public static void main(String[] args) {
        String input = "abc123";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(Character.isDigit(ch)){
                result +=ch;
            }
        }
        System.out.println("Numbers of string is: " + result);

        }
    }