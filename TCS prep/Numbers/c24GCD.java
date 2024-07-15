// Find the GCD fo two numbers;

public class c24GCD {
    public static void gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println(num1);
    }

    // public static int findGCD(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return findGCD(b, a % b);
    // }
    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 12;
        gcd(num1, num2);
    }
}
