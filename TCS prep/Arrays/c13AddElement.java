// Problem Statement: Given an array of N integers, write a program to add an array element at the beginning, end, and at a specific position.

public class c13AddElement {
    // Insert element at the begging of the array
    public static int[] insertBeginning(int[] arr, int k) {
        int[] newArray = new int[arr.length + 1];
        newArray[0] = k;
        // System.arraycopy(arr, 0, newArray, 1, arr.length);
        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }
        return newArray;
    }

    // Insert element at the last of the array
    public static int[] insertLast(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        // System.arraycopy(arr, 0, newArray, 0, arr.length);
        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = arr[i];
        }
        newArray[arr.length] = element;
        return newArray;
    }

    // Insert element at a specific position
    public static int[] insertAtPos(int[] arr, int element, int position) {
        int[] newArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArray, 0, position - 1);
        newArray[position - 1] = element;
        System.arraycopy(arr, position - 1, newArray, position, arr.length - (position - 1));
        return newArray;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int array[] = insertBeginning(arr, 6);
        int array2[] = insertLast(arr, 6);
        int array3[] = insertAtPos(arr, 6, 2);
        printArray(array);
        printArray(array2);
        printArray(array3);
    }
}
