import java.util.*;

public class Matrics {
    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Found " + matrix[i][j] + " at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }
    public static void checkLimits(int matrix[][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<matrix.length; i++)
        {
            for(int j = 0 ; j< matrix.length ; j++)
            {
                if(largest<matrix[i][j])
                {
                    largest = matrix[i][j];
                }
                if(smallest > matrix[i][j])
                {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println("Largest element in matrix is : "+ largest);
        System.out.println("Smallest element in matrix is : "+ smallest);
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int matrix[][] = new int[3][3];
        int n = 3;
        int m = 3;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 5);
        checkLimits(matrix);
    }
}
