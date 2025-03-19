public class patterns {
    public static void main(String[] args) {
        System.out.println("Hello world!!");
        rectangle();
        hollowRectangle();
        halfPyramid();
        reverseHalfPyramid();
        invertedHalfPyramid();
        halfPyramidWithNumbers();
        invertedHalfPyramidWithNumbers();
        floydTriangle();
        zeroOneTriangle();
    }

    public static void rectangle() {
        for (int j = 0; j < 5; j++) {
            System.out.println("*".repeat(5));
        }
    }

    public static void hollowRectangle() {
        int rows = 4, cols = 4;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void halfPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseHalfPyramid() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid() {
        int n = 4;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop -> spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // inner loop -> stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfPyramidWithNumbers() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramidWithNumbers() {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void floydTriangle() {
        int counter = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zeroOneTriangle() {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
