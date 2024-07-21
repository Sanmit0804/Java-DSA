import java.util.*;

public class Revision2 {
    public static void MaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
            if (secondMin > arr[i] && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println("Max element of the array: " + max);
        System.out.println("Second Max element of the array: " + secondMax);
        System.out.println("Min element of the array: " + min);
        System.out.println("Second Min element of the array: " + secondMin);
    }

    public static void reverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
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
                        counted[j] = true;
                    }
                }
                System.out.println("Element: " + arr[i] + " Frequency: " + count);
            }
        }
    }

    public static void rearrange(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        // Add elements to the set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // convert back to the array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        // print new Array
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        // MaxAndMin(arr);

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // reverse(arr);

        // int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4 };
        // frequencyCount(arr);

        // int arr[] = { 4, 2, 8, 6, 15, 5, 9, 20 };
        // rearrange(arr);

        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        removeDuplicates(arr);
    }
}
