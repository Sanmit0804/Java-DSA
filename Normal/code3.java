import java.util.Scanner;

public class code3 {

    public static int fact(int num) {
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }  

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            int fact = fact(num);
            System.out.println(fact);
        }
    }
}
