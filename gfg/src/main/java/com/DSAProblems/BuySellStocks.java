package main.java.com.DSAProblems;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BuySellStocks {

    // Problem Statement: You are given an array of prices where prices[i] is the price of a given stock on an ith day.
    // You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. Return the maximum profit 
    // you can achieve from this transaction. If you cannot achieve any profit, return 0.

    public static void main(String[] args) {
        // int[] arr = {7,1,5,3,6,4};
        // int[] arr = {5,5,5,6,1,8};
        int [] arr = {5,5};
        int n = arr.length;
        int maxProfit = maxProfit(arr, n, 0, n);
        System.out.println("Max Profit: " + maxProfit);
        int maxProfit2 = maxProfit2(arr, n);
        System.out.println("Max Profit 2: " + maxProfit2);
    }

    //option 1: brute force -> 2 loops
    //optimal approach
    //time complexity: O(n^2)
    private static int maxProfit(int[] arr, int n, int start, int end){
        System.out.println("start: " + start + " end: " + end);
        boolean isDecendingSort = true;
        for(int i=start;i<end-1;i++){
            if (arr[i] < arr[i+1]){
                isDecendingSort = false;
                break;
            }
        }
        if(isDecendingSort){
            return 0;
        }
        int mxPrice = Arrays.stream(arr, start, end).max().getAsInt();
        int mxPriceIndex = Arrays.stream(arr, start, end).boxed().collect(Collectors.toList()).indexOf(mxPrice);
        int mnPrice = Arrays.stream(arr, start, mxPriceIndex+1).min().getAsInt();
        int profit = mxPrice-mnPrice;
        System.out.println("mxPrice: " + mxPrice + " mnPrice: "+ mnPrice + "mxPriceIndex: " + mxPriceIndex + " mnPrice: " + mnPrice + " profit: " + profit);
        return Math.max(profit, maxProfit(arr, n, mxPriceIndex+1, end));
    }

    //optimal approach
    //time complexity: O(n)
    private static int maxProfit2(int[] arr, int n){
        int minPrice = arr[0];
        int maxProfit = 0;
        for(int i=0;i<n;i++){
            if(arr[i]<minPrice){
                minPrice = arr[i];
            }
            if(arr[i]-minPrice>maxProfit){
                maxProfit = arr[i]-minPrice;
            }
        }
        return maxProfit;
    }
}
