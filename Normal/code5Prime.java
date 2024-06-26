import java.util.Scanner;

public class code5Prime {
    public static void prime(int num) {
        if (num == 2) {
            System.out.print("Prime number");
            return;
        }
        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                System.out.print("Not Prime");
            } else {
                System.out.print("Prime Number");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            prime(num);
        }
    }
}
