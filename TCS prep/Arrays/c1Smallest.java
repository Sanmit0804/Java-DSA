public class c1Smallest {
    public static void smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        smallest(arr);
    }

}
