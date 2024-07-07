// Given an integer arrray nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

public class assignment1 {
    public static boolean distinctCheck(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2,3,4,5,6,7,8,9,5};

        boolean check = distinctCheck(nums);
        System.out.println(check);
    }
}
