public class DecimalToBinary {
    public static void DecToBin(int decNum) {
        int pow = 0;
        int binNum = 0;
        int myNum = decNum; 

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary form of "+ myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        int n = 7;
        DecToBin(n);
    }

}
