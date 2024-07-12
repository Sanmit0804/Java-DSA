import java.util.*;

public class c14FindRepeating {
    public static void findRepeats(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.print(nums[i]);

            }
        }
        // for (int i = 0; i < nums.length; i++) {
        // for (int j = i + 1; j < nums.length; j++) {
        // if (nums[i] == nums[j]) {
        // System.out.print(nums[i]);
        // }
        // }
        // }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 3 };
        findRepeats(nums);
    }
}
