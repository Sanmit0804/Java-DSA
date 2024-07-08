import java.util.*;

public class Prime {
    public static void primeCheck(int n) {
        if (n == 2) {
            System.out.println("Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime Number");
            } else {
                System.out.println("Not a prime number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeCheck(n);
    }
}
