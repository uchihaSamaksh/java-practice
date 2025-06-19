package com.DSAProblems;

import java.util.Arrays;
import java.util.HashMap;

//Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
//Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in non-decreasing order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].



public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] nums = {1, 3, 5, -7, 6, -3};
        int target = 0;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        int[] result2 = twoSum.usingHasing(nums, target);
        System.out.println(Arrays.toString(result2));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length; i++) {
          for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] + nums[j] == target) {
              array[0] = i;
              array[1] = j;
              return array;
            }
          }
        }
        return array;
      }

    public int[] usingHasing(int[] nums, int target) {
        int[] array = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i = 0; i< nums.length; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp))
                {
                    array[0] = i;
                    array[1] = map.get(temp);
                    return array;
                }
        }
        return array;
    }
}
