// Largest Number

public class code2LargestInArray {
    public static void getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE; // minimum possible value of integer
        int smallest = Integer.MAX_VALUE; // Maximum possible value of integer

        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            smallest = Math.min(smallest, numbers[i]);
        }
        System.out.println("Largest Number is: " + largest);
        System.out.println("Smallest Number is: " + smallest);
    }

    public static void main(String[] args) {
        System.out.println("Hello World..!!");
        int numbers[] = { 1, 2, 6, 3, 5, -8 };
        getLargest(numbers);
    }
}
