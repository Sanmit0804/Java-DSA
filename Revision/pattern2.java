public class pattern2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // butterfly();
        // solidRhombus();
        // numberPyramid();
        // palindromicPattern();
        diamondPattern();
    }

    public static void butterfly() {
        int n = 4;

        // Upper
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 2 * (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void solidRhombus() {
        int n = 4;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numberPyramid() {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicPattern() {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }

            // 1st numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // 2nd numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void diamondPattern() {
        int n = 4;

        // 1st half
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            // 1st stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2nd stars
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }

            // 1st stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // 2nd stars
            for (int j = 2; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
