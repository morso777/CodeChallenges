package org.example;

import java.util.Scanner;

public class RotateArray {



    public static void main (String [] args){
        //Scanner s = new Scanner(System.in);
        rotate();
    }

    public static void rotate () {
        int [] nums = {1,2,3,4,5,6,7};
        int k=3;

        if (k > nums.length)
            k = k % nums.length;
        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }
        System.arraycopy(result, 0, nums, 0, nums.length);
    }

}
