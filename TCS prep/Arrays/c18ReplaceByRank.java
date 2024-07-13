// Problem Statement: Given an array of N integers, the task is to replace each element of the array by its rank in the array.
/*
Example 1:
Input: 20 15 26 2 98 6
Output: 4 3 5 1 6 2
Explanation: When sorted,the array is 2,6,15,20,26,98. So the rank of 2 is 1,rank of 6 is 2,rank of 15 is 3 and so…

Example 2:
Input: 1 5 8 15 8 25 9
Output: 1 2 3 5 3 6 4
Explanation: When sorted,the array is 1,5,8,8,9,15,25. So the rank of 1 is 1,rank of 5 is 2,rank of 8 is 3 and so…
*/

////////////////////// Ramaining code

import java.util.*;

public class c18ReplaceByRank {
    public static void replaceByRank(int[] arr) {
        Arrays.sort(arr);
        // int newArray[] = new int[arr.length];
        for(int i = 0; i<arr.length ; i++)
        {
            HashSet<Integer> set = new HashSet<>();
            for(int j = 0 ; j<arr.length; j++)
            {
                if(arr[j] < arr[i])
                {
                    set.add(arr[j]);
                }
            }
            int rank = set.size() + 1;
            System.out.print(rank+ " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 20, 15, 26, 2, 98, 6 };
        replaceByRank(arr);
    }

}
