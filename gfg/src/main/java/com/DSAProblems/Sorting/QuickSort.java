package main.java.com.DSAProblems.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,1,7,8};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            System.out.println(Arrays.toString(arr));
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low,int high){
        int pivot = arr[low];
        int i=low, j=high;
        while(i<j){
            while(arr[i]<=pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    
}
