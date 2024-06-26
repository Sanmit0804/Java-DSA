// Binary to Decimal 

import java.util.Scanner;

public class code8DecToBin {
    public static void DecToBin(int DecNum) {
        int binNum = 0;
        int pow = 0;
        int myNum = DecNum;
      
        while (DecNum > 0) {
            int remainder = DecNum % 2;
            binNum = binNum + (remainder * (int)Math.pow(10,pow));
            pow++;
            DecNum = DecNum / 2;
        }
        
        System.out.println("Binary of "+ myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Decimal digit: ");
            int binary = sc.nextInt();
            DecToBin(binary);
        }
    }
}
