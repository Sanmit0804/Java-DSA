import java.util.*;

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

    public static void average(int[] arr) {
        double sum = 0;
        double size = arr.length;

        for (int i = 0; i < size; i++) {
            sum = sum + (double) arr[i];
        }
        double avg = sum / size;

        System.out.printf("%.2f", avg);
    }

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

    public static void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set (duplicates will be automaticaly removed)
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Using creating Iterator object
        // Iterator itr = set.iterator();
        // while(itr.hasNext())
        // {
        // System.out.println(itr.next());
        // }

        // Convert set back to an array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (Integer element : set) {
            newArray[index++] = element;
        }
        printArray(newArray, arr.length);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] insertBeginning(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];
        newArray[0] = element;

        for (int i = 1; i < newArray.length; i++) {
            newArray[i] = arr[i - 1];
        }
        return newArray;
    }

    public static int[] insertLast(int[] arr, int element) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < newArray.length - 1; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static int[] insertAtPos(int[] arr, int element, int position)
    {
        int[] newArray = new int[arr.length+1];
        System.arraycopy(arr, 0, newArray, 0, position-1);
        newArray[position-1] = element;
        System.arraycopy(arr, position-1, newArray, position, arr.length - (position - 1));
        return newArray;
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

        // int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // The array to be rotated
        // int k = 2; // Number of elements to rotate by
        // int n = arr.length; // Size of the array

        // // Rotate the array
        // leftRotate(arr, k, n);

        // // Print the rotated array
        // printArray(arr, n);

        // int[] arr = { 1, 2, 1, 1, 5, 1 };
        // average(arr);

        // int arr[] = { 4, 7, 1, 2, 5, 6 };
        // median(arr);

        // int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        // removeDuplicates(arr);

        int[] arr = { 1, 2, 3, 4, 5 };
        int array[] = insertBeginning(arr, 6);
        int array2[] = insertLast(arr, 6);
        int array3[] = insertAtPos(arr, 6, 2);
        printArray(array);
        printArray(array2);
        printArray(array3);
    }
}
