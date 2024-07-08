// Program to print all the prime numbers between 1 to 100

package Loops;

import java.util.*;

public class code8PrimeImprovised {
    public static void prime(int n) {
        for (int i = 1; i < n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
}
