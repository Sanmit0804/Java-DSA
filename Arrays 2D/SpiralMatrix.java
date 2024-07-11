public class SpiralMatrix {
    public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startColumn = 0;
        int endRow = matrix.length - 1;
        int endColumn = matrix[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            // top boundary -> (Row fixed, Column change)
            for (int j = startColumn; j <= endColumn; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // right boundary -> (Row change, column fix)
            // Here startRow+1 is because startRow is already print in the first step
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endColumn] + " ");
            }

            // bottom boundary -> (Row fixed, column change)
            for (int j = endColumn - 1; j >= startColumn; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // left boundary -> (Row change, Column fix)
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startColumn == endColumn) {
                    break;
                }
                System.out.print(matrix[i][startColumn] + " ");
            }

            startColumn++;
            startRow++;
            endRow--;
            endColumn--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printSpiral(matrix);
    }
}
