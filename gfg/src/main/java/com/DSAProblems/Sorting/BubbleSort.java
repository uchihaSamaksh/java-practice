// @ts-nocheck
package main.java.com.DSAProblems.Sorting;

import java.util.Arrays;

//Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
//The pass through the list is repeated until the list is sorted.
//Time Complexity: O(n^2)
//Space Complexity: O(1)
//Stable: Yes
//In-place: Yes
//Online: Yes
//Adaptive: Yes
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
