// Max of Subarrays in optimized prefix manner
// time complexity = O(n^2)

public class code7MaxSubArray {
    public static void printSubArrays(int numbers[]) {
        int maximum = Integer.MIN_VALUE; // Assign minimum value possible for integer
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        // calculate prefix array
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i + 1; j < numbers.length; j++) {
                int end = i;
                int currSum;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // System.out.println();
                if (maximum < currSum) {
                    maximum = currSum;
                }
            }
            // System.out.println();
        }
        System.out.println("Highest value is : " + maximum);
    }

    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}
