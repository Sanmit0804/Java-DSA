// Check if a number is Automorphic Number

// Problem Statement: Given a number, check if it is automorphic or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

// Examples:

// Example 1:
// Input Format: N = 76
// Result: Automorphic Number
// Explanation: Calculating 76 * 76 gives 5776, it ends with the given number.

// Input Format: 25
// Result: Automorphic Number
// Explanation: Calculating 25 * 25 gives 625, it ends with the given number.

public class c23Automorphic {
    public static void isAutomorphic(int n) {
        int square = n * n;
        String numStr = String.valueOf(n);
        String squareStr = String.valueOf(square);

        if(squareStr.endsWith(numStr))
        {
            System.out.println("Automorphic number");
        }else{
            System.out.println("not");
        }
    }

    public static void main(String[] args) {
        int n = 12;
        isAutomorphic(n);
    }
}
