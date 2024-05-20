package org.example;

public class reverse {


    public static void main(String[] args) {
        String original = "Hiran";

        // Method 1: Using StringBuilder
        String reversed1 = reverseStringUsingStringBuilder(original);
        System.out.println("Reversed string using StringBuilder: " + reversed1);

        // Method 2: Using manual loop
        String reversed2 = reverseStringUsingLoop(original);
        System.out.println("Reversed string using manual loop: " + reversed2);
    }

    // Method to reverse a string using StringBuilder
    public static String reverseStringUsingStringBuilder(String original) {
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();
        return sb.toString();
    }

    // Method to reverse a string using a manual loop
    public static String reverseStringUsingLoop(String original) {
        char[] chars = original.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        return new String(chars);
    }


}
