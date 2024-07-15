// Check whether a number is Perfect Number or not
// A perfect number is defined as a number that is the sum of its proper divisors ( all its positive divisors excluding itself). 

/*
Examples:

Example 1:
Input: n=6
Output: 6 is a perfect number

Example 2:
Input: n=15
Output: 15 is not a perfect number

Example 3:
Input: n=28
Output: 28 is a perfect number
Reason:
For 6 and 28 , the sum of their proper divisors (1+2+3) and (1+4+7+14) is equal to the respective numbers and for 15 it is not.
*/

public class c6PerfectNumber {
    public static void isPerfect(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == num) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }
    }

    public static void main(String[] args) {
        int num = 28;
        isPerfect(num);
    }
}
