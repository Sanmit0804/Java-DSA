import java.util.*;

public class factorial {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int fact = 1;

            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println(fact);
        }
    }
}
