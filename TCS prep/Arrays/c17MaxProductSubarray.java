public class c17MaxProductSubarray {
    public static void maxProductSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("Array has no elements");
            return;
        }
        int maxProduct = Integer.MIN_VALUE;
        // int maxProduct = nums[0];
        int minProduct = Integer.MAX_VALUE;
        // int minProduct = nums[0];
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

    public static void main(String[] args) {
        // int[] nums = { 1, 2, 3, 4, 5, 0 };
        int[] nums = { 1, 2, -3, 0, -4, -5 };
        maxProductSubarray(nums);
    }
}
