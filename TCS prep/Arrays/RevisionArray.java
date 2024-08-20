public class RevisionArray {
    public static void smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    public static void largest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }

    public static void secondSmallest(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (secondSmallest > arr[i] && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println(secondSmallest);
    }

    public static void main(String[] args) {
        // int[] arr = { 4, 5, 6, 2, 7, 8, 9 };
        // largest(arr);

        // int[] arr = { 4, 5, 6, 2, 7, 8, 9 };
        // smallest(arr);

        // int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        // secondLargest(arr);
        int[] arr = { 4, 5, 6, 2, 7, 8, 1, 9 };
        secondSmallest(arr);
    }
}
