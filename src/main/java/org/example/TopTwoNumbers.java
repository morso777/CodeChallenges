package org.example;
import java.util.Arrays;

public class TopTwoNumbers {
    /**
     * Main, executable method
     * THIS METHOD SHOULD PRINT ALL EXPECTED OUTPUT
     * @param   args
     */
    public static void main(String args[]) {
        int[] arr = { 1, 25, 40, 55, 87, 827, 8364, 7634, 323, 666, 192842334, 4482642 };
        //int[] arr = { 1, 25, 40, 55, 87, 827, 8364, 7634, 323, 666, 5000000, 700000000 };
        System.out.println("Let's begin...");

        // Print original collection
        System.out.println("1) Original collection: " + Arrays.toString(arr));

        // Find the top two numbers
        int[] topTwo = findTopTwo(arr);

        // Print greatest number
        System.out.println("2) Greatest number: " + topTwo[0]);

        // Print second greatest number
        System.out.println("3) Second greatest number: " + topTwo[1]);
    }

    // Find the top two numbers in the array
    private static int[] findTopTwo(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }

        return new int[]{max1, max2};
    }
}

