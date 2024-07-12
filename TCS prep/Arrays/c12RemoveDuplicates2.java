// Remove duplicates from unsorted array
import java.util.*;

public class c12RemoveDuplicates2 {
    public static int removeDuplicate(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        int k = removeDuplicate(arr);
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
