// Replace all the 0’s with 1 in a given integer

public class c32Replace {
    public static void replace(int n) {
        String a = String.valueOf(n).replaceAll("0", "1");
        int ans = Integer.parseInt(a);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int n = 102003;
        replace(n);
    }

}
