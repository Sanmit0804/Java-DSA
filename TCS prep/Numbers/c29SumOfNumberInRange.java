public class c29SumOfNumberInRange {
    public static void main(String[] args) {
        int l = 2;
        int r = 7;

        int sum = 0;
        while (l <= r) {
            sum = sum + l;
            l++;
        }
        System.out.println(sum);
    }
}
