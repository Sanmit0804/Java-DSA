// Permutations in which N people can occupy R seats
// Problem Statement: Find permutations in which n people can occupy r seats in a classroom.

// Examples:

// Example 1:
// Input: N = 5, r = 3
// Output: 60
// Explanation: To permute n people in r seats we have to find the value of n!/(n-r)!.The value of 5!/(5-3)! Is 60.

// Example 2:
// Input: N=6,r = 4.
// Output: 360

// n!/(n-r)!

public class c30Permutations {
    public static void permute(int n, int r) {
        int permute = fact(n) / fact(n - r);
        System.out.println(permute);
    }

    public static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int N = 5;
        int r = 3;
        permute(N, r);
    }
}
