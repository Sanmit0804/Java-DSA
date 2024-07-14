// Problem Statement: Finding Equilibrium index in an array

// Given a 0-indexed integer array nums, find the leftmost equilibrium Index.

// An equilibrium Index is an index at which sum of elements on its left is equal to the sum of element on its right. That is, nums[0] + nums[1] + ... + nums[equilibriumIndex-1] == nums[equilibriumIndex+1] + nums[equilibriumIndex+2] + ... + nums[nums.length-1]. If equilibriumIndex == 0, the left side sum is considered to be 0. Similarly, if equilibriumIndex == nums.length - 1, the right side sum is considered to be 0.

// Return the leftmost equilibrium Index that satisfies the condition, or -1 if there is no such index.

public class c21EquilibriumIndex {
    public static void findEquilibrium(int[] arr) {
        int leftSum, rightSum;

        for (int i = 0; i < arr.length; i++) {
            leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            rightSum = 0;
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -1, 8, 4 };
        findEquilibrium(nums);
    }
}
