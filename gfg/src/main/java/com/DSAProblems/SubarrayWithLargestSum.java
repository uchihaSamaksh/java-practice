package main.java.com.DSAProblems;

public class SubarrayWithLargestSum {
    public static void main(String[] args) {
        int[] arr = {2, -3,3, 5, -2, 7, -4, 10};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("Brute Force Approach: " + maxSum);

        int maxSum2 = maxSubarraySum2(arr, 0, n, n);
        System.out.println("Recursive Approach: " + maxSum2);

        // int maxSum3 = maxSubarraySum3(arr, n);
        // System.out.println("Dynamic Programming Approach: " + maxSum3);

        int maxSum4 = maxSubarraySum4(arr, n);
        System.out.println("Optimal Solution: " + maxSum4);
    }

    // Brute Force Approach
    // Time Complexity: O(n^3)
    public static int maxSubarraySum(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    // Recursive Approach
    // Time Complexity: O(n^2)
    public static int maxSubarraySum2(int[] arr,int start, int end, int n){
        // int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        if(start == end || start > n || end < 0){
            return 0;
        }
        for(int i = start; i < end; i++){
            sum += arr[i];
        }
        return Math.max(sum, Math.max(maxSubarraySum2(arr, start, end-1, n), maxSubarraySum2(arr, start+1, end, n)));
    }

    // Dynamic Programming Approach
    // Time Complexity: O(n^2)
    public static int maxSubarraySum3(int[] arr, int n){
        int[][] dp = new int[n][n];
        for(int i = 0; i < n; i++){
            dp[i][0] = arr[i];
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i][j-1] + arr[i+j];
            }
        }
        return dp[0][n-1];
    }

    //Optimal Solution
    // Kadane's Algorithm
    // If sum goes below 0 then we reset the sum to 0
    // Time Complexity: O(n)
    public static int maxSubarraySum4(int[] arr, int n){
        int maxSum = Integer.MIN_VALUE;
        int sum =0;
        int start = 0, end = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];

            if(sum>maxSum){
                maxSum = sum;
                end = i;
            }
            if(sum<0){
                sum =0;
                start = i+1;
            }
        }
        System.out.println("Start: " + start + " End: " + end);
        return maxSum;
    }
    
}
