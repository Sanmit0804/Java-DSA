// This is not proper code.

public class clumsyFactorial {
    public static int clumsy(int n) {
        if (n == 0)
            return 0; // Handle edge case for n = 0
        int fact = n; // Start with n
        int result = 0; 

        boolean isFirstIteration = true;

        // Iterate from n-1 down to 1
        while (fact > 0) {
            int temp = fact;

            if (fact - 1 > 0) {
                temp = temp * (fact - 1); // Multiplication
                fact--;
            }
            if (fact - 1 > 0) {
                temp = temp / (fact - 1); // Division
                fact--;
            }
            if (isFirstIteration) {
                result = result + temp; // Addition
                isFirstIteration = false;
            } else {
                result = result - temp;
            }
            if (fact - 1 > 0) {
                result = result + (temp - 1); // Subtraction
                temp--;
            }
            temp--;
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int result = clumsy(n);
        System.out.println(result); // Print the result
    }
}
