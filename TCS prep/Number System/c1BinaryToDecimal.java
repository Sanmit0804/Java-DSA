public class c1BinaryToDecimal {
    public static void binToDec(int binNum) {
        int pow = 0;
        int DecNum = 0;
        int curr = binNum;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            DecNum = DecNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + curr + " = " + DecNum);

    }

    public static void main(String[] args) {
        int binaryNum = 111;
        binToDec(binaryNum);
    }
}