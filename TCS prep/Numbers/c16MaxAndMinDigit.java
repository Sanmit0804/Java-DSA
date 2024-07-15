public class c16MaxAndMinDigit {
    public static void maxAndMin(int num) {
        int d;
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        while (num != 0) {
            d = num % 10;
            mini = Math.min(mini, d);
            maxi = Math.max(maxi, d);
            num = num / 10;
        }

        System.out.println("The minimum number is: " + mini);
        System.out.print("The maximum number is: " + maxi);
    }

    public static void main(String[] args) {
        int num = 123456;
        maxAndMin(num);
    }

}
