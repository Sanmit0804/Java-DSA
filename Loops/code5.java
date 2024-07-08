// Reverse the number
// Here we have to save the value of reverse number

package Loops;

public class code5 {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}
