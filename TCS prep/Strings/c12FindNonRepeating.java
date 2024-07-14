// Find Non-repeating characters a string

public class c12FindNonRepeating {
    public static void nonRepeatWord(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        char ch = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)] == 1) {
                ch = str.charAt(i);
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {
        String str = "yahoo";
        nonRepeatWord(str);
    }
}
