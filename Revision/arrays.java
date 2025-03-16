public class arrays {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        smallest(arr);
        largest(arr);
        secondLargest(arr);
        secondSmallest(arr);
        reverse(arr);
    }

    public static void smallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest value: " + min);
    }

    public static void largest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest value: " + max);
    }

    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                secondMax = max;
                max = arr[i];
            } else if (secondMax < arr[i] && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println("Second Largest value: " + secondMax);
    }

    public static void secondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                secondMin = min;
                min = arr[i];
            } else if (secondMin > arr[i] && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println("Second Smallest value: " + secondMin);
    }

    public static void reverse(int [] arr)
    {
        for(int i = 0; i< arr.length; i++)
        {
            for(int j = i+1; j<arr.length; j++)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // print array
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]);
        }
    }
}
