// Prime or not

package Loops;

import java.util.*;

public class code7Prime {
    public static void prime(int n) {
        if (n == 2) {
            System.out.println("Prime Number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.println("Prime number");
            } else {
                System.out.println("Not a prime number");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        prime(num);
    }
}
