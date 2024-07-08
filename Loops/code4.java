// Print reverse of a number
// n = 10899 -> 99801

// If we want last digit of some number than you can divide it with 10 and reminder will be it's last digit.
// LastDigit of 10899 will be 10899%10 

// If you want to remove last digit of the number just divide it from 10.

package Loops;

public class code4 {
    public static void main(String[] args) {
        int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10; // removing last digit
        }
    }
}
