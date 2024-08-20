public class RevisionArray {
    public static void smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondSmallest > arr[i] && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }

    public static void reverse(int[] arr) {
        // To Print reverse array
        // for(int i = 0; i<arr.length; i++)
        // {
        // System.out.print(arr[arr.length-i-1]);
        // }

        // To reverse the original array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void frequencyCount(int[] arr) {
        boolean counted[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        counted[j] = true; // Mark this element as count
                    }
                }
                System.out.println("Element: " + arr[i] + " Frequency: " + count);
            }
        }
    }

    public static void sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }

    static void swap(int arr[], int start1, int start2, int size) {
        for (int i = 0; i < size; i++) {
            int temp = arr[start1 + i];
            arr[start1 + i] = arr[start2 + i];
            arr[start2 + i] = temp;
        }
    }

    public static void leftRotate(int[] arr, int k, int n) {
        if (k == 0 || k == n) {
            return;
        }
        if (k == n - k) {
            swap(arr, 0, n - k, k);
            return;
        }

        if (k < n - k) {
            swap(arr, 0, n - k, k);
            leftRotate(arr, k, n - k);
        } else {
            swap(arr, 0, k, n - k);
            leftRotate(arr, 2 * k - n, k);
        }
    }

    static void printArray(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] arr = { 4, 5, 6, 2, 7, 8, 9 };
        // largest(arr);

        // int[] arr = { 4, 5, 6, 2, 7, 8, 9 };
        // smallest(arr);

        // int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        // secondLargest(arr);

        // int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        // secondSmallest(arr);

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // reverse(arr);

        // int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4 };
        // frequencyCount(arr);

        // int arr[] = { 1, 2, 3, 4, 5, 6 };
        // sum(arr);

        int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // The array to be rotated
        int k = 2; // Number of elements to rotate by
        int n = arr.length; // Size of the array

        // Rotate the array
        leftRotate(arr, k, n);

        // Print the rotated array
        printArray(arr, n);
    }
}
