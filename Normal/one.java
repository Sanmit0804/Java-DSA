// Print reverse of a number

public class one {
    public static void main(String[] args) {
        System.out.println("Sanmit Suthar");
        int n = 10899;
        int lastDigit;

        while (n != 0) {
            lastDigit = n % 10;
            n = n / 10;
            System.out.print(lastDigit);
        }
    }
}
