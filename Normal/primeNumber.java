// Check if a number is prime or not

public class primeNumber {
    public static void main(String[] args) {
        int n = 7;

        boolean isPrime = true;
        if (n == 2) {
            System.out.println("N is prime");
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
