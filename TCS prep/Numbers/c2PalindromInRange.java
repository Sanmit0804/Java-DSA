public class c2PalindromInRange {
    public static void palindromInRange(int min, int max) {
        while (min<= max) {
            int revNum = 0;
            int myNum = min;

            while (myNum > 0) {
                int lastDigit = myNum % 10;
                revNum = (revNum * 10) + lastDigit;
                myNum = myNum / 10;
            }
            if (revNum == min) {
                System.out.println(min);
            }
            min++;
        }
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        palindromInRange(min, max);
    }
}
