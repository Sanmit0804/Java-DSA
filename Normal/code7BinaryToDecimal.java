// Binary to Decimal 

import java.util.Scanner;

public class code7BinaryToDecimal {
    public static void BinaryToDecimal(int binNum) {
        int myNum = binNum;
        int power = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, power));
            power++;
            binNum = binNum / 10;
        }
        System.out.print("Decimal of " + myNum + " = " + decNum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter binary digit: ");
            int binary = sc.nextInt();
            BinaryToDecimal(binary);
        }
    }
}
