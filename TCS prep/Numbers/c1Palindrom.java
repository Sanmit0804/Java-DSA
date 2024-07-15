// Check if the number is palindrom or not
// Given an integer N, return true if it is a palindrome else return false.

public class c1Palindrom {
    public static boolean isPalindrom(int num) {
        int revNum = 0;
        int myNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            revNum = (revNum * 10) + lastDigit;
            num = num / 10;
        }
        if (revNum == myNum) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 234565432;
        System.out.println(isPalindrom(num));
    }
}