// Problem Statement: Given an array of n size, rotate the array by k elements using the Block Swap Algorithm.

public class c8RotateElement {
    // Function to swap 'size' elements starting from index start1 with elements
    // starting from index start2
    static void swap(int arr[], int start1, int start2, int size) {
        for (int i = 0; i < size; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }

    // Function to left rotate an array by 'k' elements
    static void leftRotate(int arr[], int k, int n) {
        // Base cases: if k is 0 or equal to n, no rotation is needed
        if (k == 0 || k == n) {
            return;
        }

        // If the size of the first part is equal to the size of the second part
        if (k == n - k) {
            swap(arr, 0, n - k, k);
            return;
        }

        // If the size of the first part is smaller
        if (k < n - k) {
            swap(arr, 0, n - k, k);
            leftRotate(arr, k, n - k);
        } else { // If the size of the first part is larger
            swap(arr, 0, k, n - k);
            leftRotate(arr, 2 * k - n, k);
        }
    }

    // Helper function to print the array
    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // The array to be rotated
        int k = 2; // Number of elements to rotate by
        int n = arr.length; // Size of the array

        // Rotate the array
        leftRotate(arr, k, n);

        // Print the rotated array
        printArray(arr, n);
    }
}
