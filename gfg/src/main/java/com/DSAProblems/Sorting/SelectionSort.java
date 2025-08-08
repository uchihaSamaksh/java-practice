package main.java.com.DSAProblems.Sorting;

import java.util.Arrays;

//Select minimum element and swap it with the first element
//Repeat the process for the remaining elements
//Time Complexity: O(n^2)
//Space Complexity: O(1)
//Stable: No
//In-place: Yes
//Online: No
//Adaptive: No
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length-1; i++){
            int minIndex = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
