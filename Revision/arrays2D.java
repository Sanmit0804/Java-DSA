import java.util.*;

public class arrays2D {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column numbers: ");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        // input
        // rows
        System.out.println("Create 2D array");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // output
        System.out.print("Enter the element you want to search: ");
        int element = sc.nextInt();

        System.out.print("Your element is at: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (element == numbers[i][j]) {
                    System.out.println("(" + i + " , " + j + ")");
                }
            }
        }

        // print array
        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < columns; j++) {
        // System.out.print(numbers[i][j] + " ");
        // }
        // System.out.println();
        // }
    }
}
