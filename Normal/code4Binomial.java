
// Code to get Binomial Coefficient
import java.util.Scanner;

public class code4Binomial {
    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int binomial(int n, int r) {
        int upperPart = fact(n);
        int lowerPart = fact(r) * fact(n - r);
        int result = upperPart / lowerPart;
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter values to find Binomial Coefficient..!");
            System.out.print("Value of n: ");
            int n = sc.nextInt();
            System.out.print("Value of r: ");
            int r = sc.nextInt();
            int result = binomial(n, r);
            System.out.println(result);
        }
    }
}