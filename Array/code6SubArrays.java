// Print Subarrays

public class code6SubArrays {
    public static void printSubarrays(int numbers[]) {
        int totalPairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print("[" + numbers[k] + "]");
                }
                totalPairs++;
                System.out.println(totalPairs);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + totalPairs);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrays(numbers);
    }
}
