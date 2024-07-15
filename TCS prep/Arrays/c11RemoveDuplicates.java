// Remove duplicates from sorted array

import java.util.*;

public class c11RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        removeDuplicates(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set (duplicates will be automatically removed)
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Convert set back to an array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (Integer element : set) {
            newArray[index++] = element;
        }

        printArray(newArray);
    }
}
