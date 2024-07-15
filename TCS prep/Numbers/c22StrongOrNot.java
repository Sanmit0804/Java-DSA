// Check if a number is a Strong Number or not

// Problem Statement: Given an integer Print “YES” if it is a strong number else print “NO”.

// Note : 

// When the sum of factorial of individual digits of a number is equal to the original number the number is called a strong number. 
// Strong number is also known as Krishnamurthi number/Peterson Number.

public class c22StrongOrNot {
    public static void isStrong(int n) {
        int sum = 0;
        int myNum = n;
        while (n > 0) {
            int lastDigit = n % 10;

            int f = fact(lastDigit);
            sum = sum + f;
            n = n / 10;
        }
        System.out.println(sum);
        if (sum == myNum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 145;
        isStrong(n);
    }
}
