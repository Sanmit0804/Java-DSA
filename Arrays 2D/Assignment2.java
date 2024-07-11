// Print out the sum of the numbers in the second row of the “nums” array
// Output = 18

public class Assignment2 {
    public static void sumOfNum(int[][] nums) {
        int sum = 0;
        for (int j = 0; j < nums[0].length; j++) {
            sum = sum + nums[1][j];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[][] nums = {
                { 1, 4, 9 },
                { 11, 4, 3 },
                { 2, 2, 3 }
        };
        sumOfNum(nums);
    }
}
