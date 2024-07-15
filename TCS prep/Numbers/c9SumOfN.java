public class c9SumOfN {
    public static void sum(int num)
    {
        int sum =0;
        for(int i = 0; i<=num; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int n = 6;
        sum(n);
    }
}
