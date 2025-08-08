package main.java.com.DSAProblems.Sorting;

import java.util.Arrays;

// Merge Sort is a divide and conquer algorithm that divides the input array into two halves, 
// calls itself for the two halves, and then merges the two sorted halves.
// 
// Complexity: O(n log n)
// Space Complexity: O(n)
// Stable: Yes
// In-place: No
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n<=1)
            return;
        int mid = n/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, n);
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i=0, j=0, k=0;
        int temp[] = new int[left.length+right.length];
        while(i<left.length && j<right.length){
            temp[k++] = left[i]<=right[j] ? left[i++] : right[j++];
            System.out.println(Arrays.toString(temp));
        }
        while(i<left.length)
            temp[k++] = left[i++];
        while(j<right.length)
            temp[k++] = right[j++];
        for(int l=0; l<temp.length; l++)
            arr[l] = temp[l];
    }
}
