import java.util.Scanner;

public class code2 {

    public static int multiply(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int result = multiply(a, b);
            System.out.println(result);
        }
    }
}
