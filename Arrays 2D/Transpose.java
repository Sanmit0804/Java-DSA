// Transpose
// Transpose of matrix is the process of swapping the rows to columns. 

public class Transpose {
    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        int[][] matrix = {
                { 2, 3, 7 },
                { 5, 6, 7 }
        };

        // Print before transpose
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transopse = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transopse[j][i] = matrix[i][j];
            }
        }

        // Print after transpose
        printMatrix(transopse);
    }
}
