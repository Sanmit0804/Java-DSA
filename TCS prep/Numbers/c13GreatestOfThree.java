public class c13GreatestOfThree {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        // if (a > b && a > c) {
        // System.out.println("Greatest number is : " + a);
        // } else if (b > a && b > c) {
        // System.out.println("Greatest number is : " + b);
        // } else {
        // System.out.println("Greatest number is : " + c);
        // }

        System.out.println("Greatest number is : " + Math.max(a, Math.max(b, c)));
    }
}
