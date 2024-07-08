package Sorting;

public class insertionSortExample {
    public static void insertionSort(int[] arr) {
        // for (int i = 1; i < arr.length - 1; i++) {
        // int curr = arr[i];
        // int prev = i - 1;
        // // finding out correct pos to insert
        // while (prev >= 0 && arr[prev] > curr) {
        // arr[prev + 1] = arr[prev];
        // prev--;
        // }
        // // insertion
        // arr[prev + 1] = curr;
        // }

        for (int m = 1; m < arr.length; m++) {
            int n = m;
            while (n > 0 && arr[n - 1] > arr[n]) {
                int temp = arr[n];
                arr[n] = arr[n - 1];
                arr[n - 1] = temp;
                n--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insertionSort(arr);
        printArr(arr);
    }
}
