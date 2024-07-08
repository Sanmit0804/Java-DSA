// Bubble sort - Descending
// Selection sort - Descending

package Sorting;

public class assign1 {
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < (nums.length - i - 1); j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }
    
    public static void SelectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minPos = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[minPos] > nums[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }
    
    public static void printArray(int arr[]) {
        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };
        // bubbleSort(nums);
        SelectionSort(nums);
        printArray(nums);
    }
}
