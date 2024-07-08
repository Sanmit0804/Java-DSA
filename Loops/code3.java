// Print sum of first n natural numbers

package Loops;

import java.util.*;

public class code3 {
    public static void sum(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result = result + i;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
    }
}
