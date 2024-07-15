// Check if the number is Abundant number of not
// Definition: If the sum of divisors of a number is greater than the number then it is called abundant number.

//---------------------------------------------------------------------

// Examples:

// Example 1:
// Input: 18
// Output: Abundant Number
// Explanation: Divisors of 18 are 1,2,3,6,9. 1+2+3+6+9=21, Since 21 is greater than 18, 18 is an abundant number.

// Example 2:
// Input: 21
// Output: Not Abundant Number
// Explanation:Divisors of 21 are 1,3,7. 1+3+7=11, Since 11 is smaller than 21, 11 is not an abundant number.

public class c27AbundantOrNot {
    public static void abundant(int num) {
        int myNum = num;
        int sum = 0;
        int factor = 1;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factor = i;
                sum = sum + factor;
            }
        }
        if (sum > num) {
            System.out.println("Abundant number");
        } else {
            System.out.println("Not");
        }
    }

    public static void main(String[] args) {
        int num = 18;
        abundant(num);
    }
}
