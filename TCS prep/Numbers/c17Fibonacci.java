public class c17Fibonacci {
    public static void printFibonacci(int n) {
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        // System.out.println(printFibonacci(n));
        printFibonacci(n);
    }
}
