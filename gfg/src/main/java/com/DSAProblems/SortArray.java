package com.DSAProblems;

// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. The sorting must be done in-place, without making a copy of the original array.
// Input: nums = [1, 0, 2, 1, 0]
// Output: [0, 0, 1, 1, 2]
// Explanation: The nums array in sorted order has 2 zeroes, 2 ones and 1 two

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        // int[] nums = {1, 0, 2, 1, 0};
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortArray(nums);
        System.out.println(Arrays.toString(nums));
        sortWithCount(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortArray(int[] nums) {
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < nums.length - 1; i++){
                if(nums[i] > nums[i+1]){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    swapped = true;
                }
            }
        }
    }

    public static void sortWithCount(int[] nums){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < nums.length; i++){
            switch (nums[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                default:
                    break;
            }
        }
        for(int i = 0; i < count0; i++){
            nums[i] = 0;
        }
        for(int i = count0; i < count0 + count1; i++){
            nums[i] = 1;
        }
        for(int i = count0 + count1; i < nums.length; i++){
            nums[i] = 2;
        }
    }
}
