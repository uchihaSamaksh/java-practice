package main.java.com.DSAProblems;

public class FindUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2, 1, 3, 6, 4};
        int unique = findUnique(arr);
        System.out.println(unique);
    }

    // brute force approach -> pick one element and check if it is present in the array
    // if it is present, then pick the next element and check if it is present in the array
    // if it is present, then pick the next element and check if it is present in the array


    // optimal approach -> use XOR operator
    public static int findUnique(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique ^= arr[i];
        }
        return unique;
    }
}