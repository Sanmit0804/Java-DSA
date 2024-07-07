// bubble sort

// Best-case Time complexity = O(n)
// Average-case Time complexity = O(n^2)
// Worst-case Time complexity = O(n^2)
// Space Complexity = O(1)

package Sorting;

public class bubbleSortExample {
    public static void handleBubbleSort(int nums[]) {
        int n = nums.length;
        int temp = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        // Print the array
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 3, 4, 8, 6, 1, 2 };
        System.out.println("Hello");
        handleBubbleSort(nums);
    }

}
