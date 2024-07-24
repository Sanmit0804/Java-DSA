import java.util.Arrays;
import java.util.HashSet;

public class Revision {

    public static void largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void smallest(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondLargest < arr[i] && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }

    public static void secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            smallest = Math.min(smallest, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondSmallest > arr[i] && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }

    public static void reverse(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
            }
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
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
            System.out.println(arr[i] + " ");
        }
        for (int i = arr.length - 1; i >= arr.length / 2; i--) {
            System.out.println(arr[i] + " ");
        }
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

        // Add elements to the set
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        // Convert set back to the array
        int[] newArray = new int[set.size()];
        int index = 0;
        for (int value : set) {
            newArray[index++] = value;
        }

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }

    public static int removeDuplicates2(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void findNonRepeats(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    // System.out.println(nums[i]);
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void maxProductSubarray(int nums[]) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array has no elements");
        }
        int maxProduct = Integer.MIN_VALUE;
        int minProduct = Integer.MAX_VALUE;
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap maxProduct and minProduct if the current number is negative
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            // Update the result
            result = Math.max(result, maxProduct);
        }
        System.out.println(result);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate k elements to the right
    public static void rotateToRight(int[] arr, int n, int k) {
        // Reverse the first n-k elements
        reverse(arr, 0, n - k - 1);

        // Reverse the last k elements
        reverse(arr, n - k, n - 1);

        // Reverse whole array
        reverse(arr, 0, n - 1);
    }

    public static void rotateToLeft(int[] arr, int n, int k) {
        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse last n-k elements
        reverse(arr, k, n - 1);

        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 2;
        System.out.print("Before Rotating the k elements to right ");
        printArray(arr);
        rotateToLeft(arr, n, k);
        System.out.print("After Rotating the k elements to left ");
        // rotateToRight(arr, n, k);
        // System.out.print("After Rotating the k elements to right ");
        printArray(arr);

        // int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        // largest(arr);
        // smallest(arr);
        // secondLargest(arr);
        // secondSmallest(arr);

        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // reverse(arr);

        // int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4 };
        // frequencyCount(arr);

        // int arr[] = { 4, 2, 8, 6, 15, 5, 9, 20 };
        // rearrange(arr);

        // int arr[] = { 4, 7, 1, 2, 5, 6 };
        // median(arr);

        // int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        // removeDuplicates(arr);

        // int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        // int k = removeDuplicates2(arr);
        // for (int i = 0; i < k; i++) {
        // System.out.print(arr[i] + " ");
        // }

        // int[] nums = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 3 };
        // findNonRepeats(nums);

        // int[] nums = { 1, 2, -3, 0, -4, -5 };
        // maxProductSubarray(nums);
    }
}
