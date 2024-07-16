import java.util.*;

public class Revision {
    public static boolean isPalindrom(String str) {
        str = str.trim().toLowerCase();
        str = str.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void countVowels(String str) {
        int vowels = 0;
        int consonants = 0;
        int whiteSpaces = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch == ' ') {
                whiteSpaces++;
            } else {
                consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonanats: " + consonants);
        System.out.println("White Spaces: " + whiteSpaces);
    }

    public static void ascii(char ch) {
        int n = ch;
        System.out.println(n);
    }

    public static void removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.replaceAll("[^a-zA-Z]", "");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static String removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void removeSpecialChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void reverse(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public static void removeBrackets(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == ')') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static int sumOfNumbersInString(String str) {
        int sum = 0;
        int currentNumber = 0;
        boolean isDigitSequnce = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                currentNumber = (currentNumber * 10) + (ch - '0');
                isDigitSequnce = true;
            } else {
                if (isDigitSequnce) {
                    sum = sum + currentNumber;
                    currentNumber = 0;
                    isDigitSequnce = false;
                }
            }
        }
        if (isDigitSequnce) {
            sum = sum + currentNumber;
        }
        return sum;
    }

    public static void capitalizeFirstAndLastChar(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (i == 0) {
                sb.append(Character.toUpperCase(ch));
            } else if (i == str.length() - 1) {
                sb.append(Character.toUpperCase(ch));
            } else if (str.charAt(i + 1) == ' ') {
                sb.append(Character.toUpperCase(ch));
            } else if (str.charAt(i - 1) == ' ') {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void frequencyCount(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch] = freq[ch] + 1;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] != 0) {
                System.out.print((char) (i));
                System.out.print(freq[i] + " ");
            }
        }
    }

    public static void nonRepeatWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                continue;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Yes it's anagram");
        } else {
            System.out.println("No it's not");
        }
    }

    public static void wildCardMatcher(String patttern, String text) {
        // Convert wildCard pattern to regular expression
        String regex = patttern.replace("?", ".").replace("*", ".*");

        // Check if the text matches the regex pattern
        if (text.matches(regex)) {
            System.out.println("The text matches the pattern");
        } else {
            System.out.println("The text does not match the pattern");
        }
    }

    public static char maxOccurChar(String str) {
        int[] freq = new int[256];
        int max = Integer.MIN_VALUE;
        char c = ' ';

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (max < freq[str.charAt(i)]) {
                max = freq[str.charAt(i)];
                c = str.charAt(i);
            }
        }
        return c;
    }

    public static String removeDuplicates(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i);
            if (ans.contains(ch)) {
                continue;
            }
            ans = ans + ch;
        }
        return ans;
    }

    public static void frequencyOfEachChar(String str) {
        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            count[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                System.out.print((char) i);
                System.out.println(count[i]);
            }
        }
    }

    public static void removeCharFromFirstStringPresentInSecondString(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            boolean match = false;
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    match = true;
                }
            }
            if (!match) {
                sb.append(str1.charAt(i));
            }

        }
        System.out.println(sb);
    }

    public static void NextLexicographicLetter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(ch == 'z' ? 'a' : (char) (ch + 1));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append(ch == 'Z' ? 'A' : (char) (ch + 1));
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void largestWord(String str) {
        String[] words = str.split(" ");
        String largestWord = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > largestWord.length()) {
                largestWord = words[i];
            }
        }
        System.out.println(largestWord);
    }

    public static String sortCharacter(String str) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);

        String ans = new String(arr);
        return ans;
    }

    public static void countWords(String str) {
        String[] words = str.split(" ");
        System.out.println(words.length);
    }

    public static String wordWithHighestRepeatChar(String str) {
        String[] words = str.split(" ");
        int maxFrequency = 0;
        String maxFrequencyWord = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int[] letterCount = new int[256];

            int currentWordMaxFrequency = 0;
            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (Character.isLetter(ch)) {
                    int index = Character.toLowerCase(ch);
                    letterCount[index]++;
                    currentWordMaxFrequency = Math.max(currentWordMaxFrequency, letterCount[index]);
                }
            }
            if (currentWordMaxFrequency > maxFrequency) {
                maxFrequency = currentWordMaxFrequency;
                maxFrequencyWord = word;
            }
        }
        return maxFrequency > 1 ? maxFrequencyWord : "-1";
    }

    public static void changeCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                sb.append(Character.toUpperCase(ch));
            } else if (ch >= 'A' && ch <= 'Z') {
                sb.append(Character.toLowerCase(ch));
            } else if (ch == ' ') {
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }

    public static int findSubstringPosition(String str1, String str2) {
        return str1.indexOf(str2);
    }

    public static void reverseWord(String str) {
        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama";
        // System.out.println(isPalindrom(str));

        // String str = "A man, a plan, a canal: Panama";
        // countVowels(str);

        // char ch = 'A';
        // ascii(ch);

        // String str = "A man, a plan, a canal: Panama";
        // removeVowels(str);

        // String str = "How are you doing!";
        // System.out.println(removeSpaces(str));

        // String str = "take12% *&u ^$#forward";
        // // String str = "1.Python & 2.Java";
        // removeSpecialChar(str);

        // String str = "Sanmit";
        // reverse(str);

        // String input1 = "a+((b-c)+d)";
        // removeBrackets(input1);

        // String input1 = "123xyz";
        // String input2 = "1xyz23";

        // System.out.println(sumOfNumbersInString(input1)); // Output: 123
        // System.out.println(sumOfNumbersInString(input2)); // Output: 24

        // String str = "take u forward is awesome";
        // capitalizeFirstAndLastChar(str);

        // String str = "aarticles";
        // frequencyCount(str);

        // String str = "yahoo";
        // nonRepeatWord(str);

        // String str1 = "care";
        // String str2 = "race";
        // isAnagram(str1, str2);

        // String pattern = "hel*o";
        // String text = "hello";
        // wildCardMatcher(pattern, text);

        // String str = "apple";
        // System.out.println(maxOccurChar(str));

        // String str = "abcabcabc";
        // System.out.println(removeDuplicates(str));

        // String str = "abcabcabc";
        // frequencyOfEachChar(str);

        // String str1 = "abcdef";
        // String str2 = "cefz";
        // removeCharFromFirstStringPresentInSecondString(str1, str2);

        // String str = "abcxyz";
        // NextLexicographicLetter(str);

        // String str = "Microsoft Teams";
        // largestWord(str);

        // String str = "zxcbg";
        // System.out.println("Before sorting:");
        // System.out.println(str);
        // System.out.println("After sorting:");
        // System.out.println(sortCharacter(str));

        // String str = "Sanmit";
        // countWords(str);

        // String str = "abcdefg google Microsoft";
        // System.out.println(wordWithHighestRepeatChar(str)); // Output should be
        // "google"

        // String str = "I am Sanmit Suthar";
        // changeCase(str);

        // Example 1
        // String str1 = "takeuforward";
        // String str2 = "forward";
        // System.out.println(findSubstringPosition(str1, str2)); // Output: 5

        // // Example 2
        // str1 = "hello";
        // str2 = "az";
        // System.out.println(findSubstringPosition(str1, str2)); // Output: -1

        String str = "Sanmitkumar Prakshkumar Suthar";
        reverseWord(str);
    }
}
