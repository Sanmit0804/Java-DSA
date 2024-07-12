public class c2Largest {
    public static void largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        largest(arr);
    }

}
