package com.DSAProblems;

import java.util.HashMap;
import java.util.Map;

// Given an integer array nums of size n, return the majority element of the array.
// The majority element of an array is an element that appears more than n/2 times in the array. 
// The array is guaranteed to have a majority element.
public class MAjorityElements {
    public static void main(String[] args) {
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int n = arr.length;
        int majorityElement = findMajorityElement(arr, n);
        System.out.println(majorityElement);
        int majorityElementUsingHashMap = findMajorityElementUsingHashMap(arr, n);
        System.out.println(majorityElementUsingHashMap);
        int majorityElementUsingMooreVotingAlgorithm = findMajorityElementUsingMooreVotingAlgorithm(arr, n);
        System.out.println(majorityElementUsingMooreVotingAlgorithm);
    }

    public static int findMajorityElement(int[] arr, int n) {
        int count = 0;
        int max = 0;
        for(int i = 0; i < n; i++) {
            count = 1;
            for(int j = i + 1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > n/2) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMajorityElementUsingHashMap(int[] arr, int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i], 1);
        }
        for(Map.Entry<Integer,Integer> entrySet : map.entrySet()){
            // System.out.println(entrySet.getKey() + " " + entrySet.getValue());
            if(entrySet.getValue() > n/2)
                return entrySet.getKey();
        }
        return -1;
    }

    // Moore's Voting Algorithm
    // onlu works if majority element exists
    public static int findMajorityElementUsingMooreVotingAlgorithm(int[] arr, int n) {
        int res = 0;
        int count = 0;
        for(int i = 0; i < n; i++) {
            if (count==0){
                res = arr[i];
            }
            if(res == arr[i])
                count++;
            else
                count--;
        }
        return res;
    }
}
