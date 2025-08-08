package main.java.com.DSAProblems;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,0,0,-2,2, 4, 5};
        int k = 9;
        int n = arr.length;
        int longestSubarray = longestSubarrayWithSumK(arr, k, n);
        System.out.println("Longest Subarray with Sum K: " + longestSubarray);
        int longestSubarrayOptimized = longestSubarrayWithSumKOptimized(arr, k, n);
        System.out.println("Longest Subarray with Sum K Optimized: " + longestSubarrayOptimized);
        int longestSubarrayTwoPointer = longestSubarrayWithSumKTwoPointer(arr, k, n);
        System.out.println("Longest Subarray with Sum K Two Pointer: " + longestSubarrayTwoPointer);
    }

    // Brute Force Approach
    private static int longestSubarrayWithSumK(int[] arr, int k, int n){
        int maxLength = 0, length =0 , sum = 0;

        for(int i = 0; i < n; i++){
            for(int j=i;j<n;j++){
                sum += arr[j];
                System.out.println("i: " + i + ", j: " + j+" , sum: "+ sum);
                length++;
                if (sum == k && length>maxLength)
                    maxLength = length;
                if (sum>k)
                    {
                        length = 0;
                        sum = 0 ;
                        continue;
                    }
            }
            sum = 0;
            length = 0;
        }
        return maxLength;
    }

    // Optimized Approach
    // Time Complexity: O(n) 
    // Space Complexity: O(n)
    private static int longestSubarrayWithSumKOptimized(int[] arr, int k, int n){
         Map<Integer, Integer> map = new HashMap<>();
         int sum = 0;
         int maxLength = 0;
         for(int i=0;i<n;i++){
            sum = sum+arr[i];
            if(sum == k){
                maxLength = i+1;
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                maxLength = Math.max(maxLength, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
         }
         return maxLength;
    }

    // Two Pointer Approach
    private static int longestSubarrayWithSumKTwoPointer(int[] arr, int k, int n){
        int left = 0, right = 0, sum = 0, maxLength = 0;
        while(right<n){
            sum = sum + arr[right];
            while(sum>k)
                {
                    sum = sum - arr[left];
                    left++;
                }
            if(sum == k)
                maxLength = Math.max(maxLength, right-left+1);

            right++;
        }
        return maxLength;
    }
}
