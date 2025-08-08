package main.java.com.DSAProblems;

public class LargestElementInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int largest = findLargest(arr);
        System.out.println(largest);
    }

    public static int findLargest(int[] arr) {
        //Brute Force Approach
        //Time Complexity: O(n)
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int Largest(int[] arr) {

    }
}
