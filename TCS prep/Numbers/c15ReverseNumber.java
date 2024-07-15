public class c15ReverseNumber {
    public static void reverse(int num) {
        int revNum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        System.out.println(revNum);
    }

    public static void main(String[] args) {
        int num = 123456;
        reverse(num);
    }
}