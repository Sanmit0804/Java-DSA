// Leap year or not
/* 
 Intuition: A year is a leap year only if it satisfies the following condition.
 
 The year is divisible by 400
 The year is divisible by 4 but not by 100
*/

public class c14LeapYear {
    public static boolean isLeap(int year) {

        // if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0) {
        // return true;
        // } else {
        // return false;
        // }

        // Remember: 4 100 400;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int year = 2024;
        System.out.println(isLeap(year));
    }
}
