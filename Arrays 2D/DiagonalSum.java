// Time complexity = O(n^2)

// Here,
// Primary Diagonal = (i==j)
// Secondary Diagonal = (i+j == n-1)
public class DiagonalSum {
    public static void diagonalSum(int[][] matrix) {
        int total = 0;

        // Primary Diagonal "\"
        int sum1 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum1 = sum1 + matrix[i][j];
                }
            }
        }
        System.out.println(sum1);

        // Secondary Diagonal "/"
        int sum2 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if ((i + j) == matrix.length - 1) {
                    sum2 = sum2 + matrix[i][j];
                }
            }
        }
        System.out.println(sum2);
        total = sum1 + sum2;
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
