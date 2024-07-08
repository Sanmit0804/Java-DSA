import java.util.*;

public class PrimeInRange {
    public static boolean isPrimeCheck(int n) {

        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                isPrime = false;
        }
        if (isPrime) {
            // System.out.println("Prime Number");
            return true;
        } else {
            // System.out.println("Not a prime number");
            return false;
        }
    }

    public static void primesInRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrimeCheck(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // isPrimeCheck(n);
        primesInRange(n);
    }
}
