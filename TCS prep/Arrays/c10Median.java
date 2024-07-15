// Problem Statement: Given an unsorted array, find the median of the given array.

import java.util.*;

public class c10Median {
    public static void median(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 == 0) {
            int ind1 = (arr.length / 2) - 1;
            int ind2 = (arr.length / 2);
            System.out.println((double) (arr[ind1] + arr[ind2]) / 2);
        } else {
            System.out.println(arr[arr.length / 2]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 7, 1, 2, 5, 6 };
        median(arr);
    }
}
