// Program to add two fraction numbers.

// Examples:

// Example 1:
// Input: 3/4 + 1/7 
// Output: 25/28
// Explanation: Since 3/4 + 1/7 = 25/28

// Example 2:
// Input: 5/2 +1/2
// Output: 3/1
// Explanation: Since 5/2 + 1/2 = 3/1

public class c31AddTwoFraction {

    public static int lcm(int a, int b) {
        int mul = a * b;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        int lcm = mul / gcd;
        return lcm;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void fractionSum(int num1, int deno1, int num2, int deno2) {
        int commonDenominator = lcm(deno1, deno2);
        int newNum1 = num1 * (commonDenominator / deno1);
        int newNum2 = num2 * (commonDenominator / deno2);
        int ansNumerator = newNum1 + newNum2;
        int ansDenominator = commonDenominator;

        // Simplify the fraction
        int gcd = gcd(ansNumerator, ansDenominator);
        ansNumerator = ansNumerator / gcd;
        ansDenominator = ansDenominator / gcd;

        // Print the result
        if (ansDenominator == 1) {
            System.out.println("Result : " + ansNumerator);
        } else {
            System.out.println("Result: " + ansNumerator + "/" + ansDenominator);
        }
    }

    public static void main(String[] args) {
        int num1 = 3;
        int deno1 = 4;
        int num2 = 1;
        int deno2 = 7;
        int ansNumerator, ansDenominator;

        fractionSum(num1, deno1, num2, deno2);

    }
}
