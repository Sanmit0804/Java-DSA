// Calculate the Power of a Number : Binary Exponentiation

public class c19PowerOfNum{
    public static void solve(int n, int pow)
    {
        int result = (int)Math.pow(n,pow);
        System.out.println(result);
    }
    public static void main(String[] args) {
        int n = 2;
        int pow = 5;
        solve(n,pow);
    }

    // public static void main(String[] args) {
    //     int x = 5, n = 3;
    //     int ans = 1;
    //     for (int i = 0; i < n; i++) {
    //         ans = ans * x;
    //     }
    //     System.out.println(x + " raised to the power " + n + " is " + ans);
    // }
}