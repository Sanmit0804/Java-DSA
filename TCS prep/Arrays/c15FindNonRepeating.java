public class c15FindNonRepeating {
    public static void findNonRepeats(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    // System.out.print(nums[i]);
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(nums[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 3 };
        findNonRepeats(nums);
    }
}
