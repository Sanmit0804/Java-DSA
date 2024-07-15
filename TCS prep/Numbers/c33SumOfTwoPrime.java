// Express given number as Sum of Two Prime Numbers

// Examples:

// Example 1:
// Input : N = 74
// Output : True . 
// Explanation: 74 can be expressed as 71 + 3 and both are prime numbers. 

// Example 2:
// Input : N = 11
// Output : False. 
// Explanation: 11 cannot be expressed as sum of two prime numbers.

public class c33SumOfTwoPrime {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void canBeExpressedAsSumOfTwoPrimes(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");

    }

    public static void main(String[] args) {
        int n = 74;
        canBeExpressedAsSumOfTwoPrimes(n);
    }
}
