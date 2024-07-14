// Given a string of characters from a to z. Print the duplicate characters(which are occurring more than once) in the given string with their occurrences count.

public class c18PrintDuplicates {
    public static void printDuplicates(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.print((char) (i + 'a'));
                System.out.print(count[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        String str = "abcabcabc";
        printDuplicates(str);
    }

}
