// Determine if 2 Strings are anagram of each other

// What are anagrams?
// If two strings contain the same characters but in a different order, they can be said to be
// anagrams. Consider race and care. In this case, race's characters can be formed into a study,
// or care's characters can be formed into race. Below is a java program to check if two strings
// are anagrams or not.
import java.util.*;

public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        if (isAnagram(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
