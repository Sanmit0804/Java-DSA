// Binary to Decimal

public class BinaryToDecimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int decNum = 0;
        int curr = binNum;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + curr + " = " + decNum);
    }

    public static void main(String[] args) {
        int binary = 101;
        binToDec(binary);
    }
}
