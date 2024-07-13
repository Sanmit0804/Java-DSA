public class c20Rotation {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Function to rotate k elements to the right
    public static void rotateToRight(int[] arr, int n, int k) {
        // Reverse the first n-k elements
        reverse(arr, 0, n - k - 1);

        // Reverse the last k elements
        reverse(arr, n - k, n - 1);

        // Reverse whole array
        reverse(arr, 0, n - 1);
    }

    // Function to rotate k elements to the left
    public static void rotateToLeft(int[] arr, int n, int k) {
        // Reverse first k elements
        reverse(arr, 0, k - 1);

        // Reverse last n-k elements
        reverse(arr, k, n - 1);

        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = arr.length;
        int k = 2;
        System.out.print("Before Rotating the k elements to right ");
        printArray(arr);
        rotateToLeft(arr, n, k);
        System.out.print("After Rotating the k elements to left ");
        // rotateToRight(arr, n, k);
        // System.out.print("After Rotating the k elements to right ");
        printArray(arr);
    }
}
