import java.util.*;

public class c22SortCharacters {
    public static String solve(String str) {
        char[] arr = str.toCharArray();
        // Arrays.sort(arr);

        // bubble sort
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = 0; j < str.length() - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        String ans = new String(arr);
        return ans;
    }

    public static void main(String args[]) {
        String str = "zxcbg";

        System.out.println("Before sorting:");
        System.out.println(str);
        System.out.println("After sorting:");
        System.out.println(solve(str));
    }

}
