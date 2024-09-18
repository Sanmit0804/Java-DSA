import java.util.*;

public class Matrics {

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }

    public static void largest(int matrix[][])
    {
        int largest = Integer.MIN_VALUE;
        for(int i =0; i<matrix.length;i++)
        {
            for(int j = 0; j<matrix[0].length ; j++)
            {
                if(matrix[i][j] > largest)
                {
                    largest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest value in matrix is : "+ largest);
    }
     
    public static void main(String[] args) {
        System.out.println("Welcome to 2D array");

        int matrix[][] = new int[3][3];
        int n = matrix.length; // length of row
        int m = matrix[0].length; // lenfth of columns

        try (// INPUT
        Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
        }
        // OUTPUT
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Search in 2D array
        search(matrix, 9);

        // Largest in 2D array
        largest(matrix);
    }
}