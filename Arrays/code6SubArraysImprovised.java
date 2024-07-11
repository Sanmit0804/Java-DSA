// SubArray with the sum of elements
// time Complexity = O(n^3)

public class code6SubArraysImprovised {
    public static void printSubArrays(int numbers[]) {
        int maxium = Integer.MIN_VALUE; // Assign minimum value possible for integer

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int currSum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                    currSum = currSum + numbers[k];
                }
                System.out.print("------------Sum of this subgroup elemets are: " + currSum);
                System.out.println();
                if (maxium < currSum) {
                    maxium = currSum;
                }
            }
            System.out.println();

        }
        System.out.println("Highest value is : " + maxium);
    }

    public static void main(String[] args) {
        // int numbers[] = { 1, -2, 6, -1, 3 };
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}
