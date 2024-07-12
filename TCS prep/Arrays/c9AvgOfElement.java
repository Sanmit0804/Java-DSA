public class c9AvgOfElement {
    public static void average(int[] arr) {
        double sum = 0;
        for(int i = 0; i<arr.length ; i++)
        {
            sum = sum + (double)arr[i];
        }
        double avg = sum/arr.length;
        // System.out.println(avg);
        System.out.printf("%.2f", avg);
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,1,1,5,1 };
        average(arr);
    }
}
