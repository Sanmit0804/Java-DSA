import java.util.*;

public class c13Anagram {
    public static void isAnagram(String str1, String str2) {
        char[] one = str1.toCharArray();
        char[] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        if (Arrays.equals(one, two)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";
        isAnagram(str1, str2);
    }
}
