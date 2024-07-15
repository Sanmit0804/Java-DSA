// Check if the given number is Harshad(Or Niven) Number

// Examples:

// Example 1:
// Input: 378
// Output: Yes it is a Harshad number.
// Explanation: 3+7+8=18. 378 is divisible by 18. Therefore 378 is a harshad number.

// Example 2:
// Input: 379
// Output: No
//  it is not a Harshad number.
// Explanation: 3+7+9=19. 379 is not divisible by 19. Therefore 379 is a harshad number.

public class c26Harshad {
    public static void isHarshad(int num) {
        int sum = 0;
        int myNum = num;
        while (num > 0) {
            int lastDigit = num % 10;
            sum = sum + lastDigit;
            num = num / 10;
        }
        if (myNum % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not Harshad Number");

        }
    }

    public static void main(String[] args) {
        int num = 378;
        isHarshad(num);
    }
}