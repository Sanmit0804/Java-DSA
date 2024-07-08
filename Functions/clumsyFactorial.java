// This is not proper code.

public class clumsyFactorial {
    public static int clumsy(int n) {
        if (n == 0) return 0; // Handle edge case for n = 0
        int fact = n; // Start with n
        int operation = 0; // Initialize operation counter

        // Iterate from n-1 down to 1
        for (int i = n - 1; i > 0; i--) {
            if (operation == 0) {
                fact = fact * i; // Multiplication
            } else if (operation == 1) {
                fact = fact / i; // Division
            } else if (operation == 2) {
                fact = fact + i; // Addition
            } else if (operation == 3) {
                fact = fact - i; // Subtraction
            }
            operation = (operation + 1) % 4; // Update operation
        }

        return fact;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = clumsy(n);
        System.out.println(result); // Print the result
    }
}
