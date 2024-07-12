// WAP for second smallest and second largest element in an array

public class c3SecondMax {
    public static void secondMaxMin(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i<arr.length; i++)
        {
            largest = Math.max(largest, arr[i]);
            smallest = Math.min(smallest, arr[i]);
        }
        for(int i = 0; i<arr.length ; i++)
        {
            if(secondLargest<arr[i] && arr[i] != largest)
            {
                secondLargest = arr[i];
            }
            if(secondSmallest>arr[i] && arr[i] != smallest)
            {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Largest element is: "+largest);
        System.out.println("Smallest elment is: "+smallest);
        System.out.println("Second largest element is: "+secondLargest);
        System.out.println("Second smallest element is: "+secondSmallest);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        secondMaxMin(arr);
    }
}
