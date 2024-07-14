// Problem Statement: Given a string, return the character that occurs the maximum number of times in the string. If the maximum occurrence of two or more characters is the same, return any one of them. 
// https://www.youtube.com/watch?v=NBV1-641hCs (For Reference)

public class c16MaxOccurChar {
    public static char maxOccurChar(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        char c = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (max < arr[str.charAt(i)]) {
                max = arr[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        return c;
    }

    public static void main(String[] args) {
        String str = "apple";
        System.out.println(maxOccurChar(str));
    }
}
