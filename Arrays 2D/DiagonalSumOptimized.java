// Time complexity = O(n)

// Here,
// Primary Diagonal = (i==j)
// Secondary Diagonal = (i+j == n-1)   -> So j = n-1-i

public class DiagonalSumOptimized {
    public static void diagonalSum(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            // Primary Diagonal
            total += matrix[i][i];
            // Secondary Diagonal
            if (i != matrix.length - 1 - i)
                total += matrix[i][matrix.length - i - 1];
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        diagonalSum(matrix);
    }

}
