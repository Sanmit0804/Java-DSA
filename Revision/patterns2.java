public class patterns2 {
    public static void main(String[] args) {
        System.out.println("Hello World!!");
        butterflyPattern();
    }

    public static void butterflyPattern() {
        int n = 4;

        // Upper
        for (int i = 1; i <= n; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // space
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower
        for (int i = n; i >= 1; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // space
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
