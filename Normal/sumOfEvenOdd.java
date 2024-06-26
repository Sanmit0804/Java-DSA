import java.util.*;

public class sumOfEvenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int number;
            int choice;
            int evenSum = 0;
            int oddSum = 0;

            do {
                System.out.println("Enter the number: ");
                number = sc.nextInt();

                if (number % 2 == 0) {
                    evenSum = evenSum + number;
                } else {
                    oddSum = oddSum + number;
                }

                System.out.println("Do you want to contiue? press 1 for yes or 0 for no");
                choice = sc.nextInt();
            } while (choice == 1);

            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);
        }
    }
}
