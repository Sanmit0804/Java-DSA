package Loops;

import java.util.*;

public class code7PrimeImprovised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < Math.sqrt(n); i++) {  // Improvise version
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
}