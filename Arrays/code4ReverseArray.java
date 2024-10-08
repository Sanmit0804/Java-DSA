// Reverse Array
// Time complexity = O(n)
// Space complexity = O(1);

public class code4ReverseArray {
    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            // Swap
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        // Print the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 5, 6, 8, 10 };
        reverse(numbers);
    }
}
