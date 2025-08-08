package main.java.com.DSAProblems.Sorting;
import java.util.Arrays;

// Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time.
// 
// Complexity: O(n^2)
// Space Complexity: O(1)
// Stable: Yes
// In-place: Yes
// Online: Yes
// Adaptive: Yes
// Best Case: O(n)
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (i==1)
                continue;
            int j = i-1;
            int key = arr[i];
            while (j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]= key;
        }
    }

}