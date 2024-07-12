// Max of Subarrays in optimized prefix manner
// time complexity = O(n^2)

public class code7MaxSubArray {
    public static int printSubArrays(int numbers[]) {
        int n = numbers.length;
        int currSum = numbers[0];
        int maxSum = numbers[0];

        for (int i = 1; i < n; i++) {
            currSum = Math.max(numbers[i], currSum + numbers[i]);
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        int numbers[] = { 2, 4, 6, 8, 10 };
        int result = printSubArrays(numbers);
        System.out.println(result);
    }
}
