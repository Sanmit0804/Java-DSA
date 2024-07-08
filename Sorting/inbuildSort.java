// time complexity: O(nlogn);

package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class inbuildSort {
    public static void printArray(int[] nums)
    {
        for(int i = 0; i<nums.length; i++)
        {
            System.out.print(nums[i]+ " ");
        }
    }
    public static void printArray(Integer[] nums)
    {
        for(int i = 0; i<nums.length; i++)
        {
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = { 5, 4, 1, 3, 2 };
        // inbuild array funtion for sort
        // we can also set starting point and ending point to sort 
        Arrays.sort(nums);
        printArray(nums);
        
        Integer nums2[] = { 5, 4, 1, 3, 2 };
        // If we want to sort in **Descending order**
        Arrays.sort(nums2, Collections.reverseOrder());
        printArray(nums2);
    }
}
