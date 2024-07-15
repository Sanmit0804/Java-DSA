// Check if a number is armstrong number of not
// An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

public class c5Armstrong {
    public static void isArmstrong(int num) {
        int length = String.valueOf(num).length();
        int sum = 0;
        int myNum = num;

        while (myNum > 0) {
            int lastDigit = myNum % 10;
            sum = sum + (int) Math.pow(lastDigit, length);
            myNum = myNum / 10;
        }
        if (sum == num) {
            System.out.println("Yes it's armstrong");
        } else {
            System.out.println("No it's not");
        }
    }

    public static void main(String[] args) {
        int num = 153;
        isArmstrong(num);
    }
}
