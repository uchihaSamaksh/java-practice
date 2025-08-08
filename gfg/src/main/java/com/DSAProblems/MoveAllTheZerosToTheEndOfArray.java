package main.java.com.DSAProblems.Sorting;

import java.util.Arrays;

public class MoveAllTheZerosToTheEndOfArray {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeros(int[] arr) {
        //Time Complexity: O(n)
        //Space Complexity: O(1)
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++) {
            if(arr[i] == 0) {
                count++;
            }
            else{
                arr[i-count] = arr[i];
            }
        }
        for(int i=n-count; i<n; i++) {
            arr[i] = 0;
        }
    }
}
