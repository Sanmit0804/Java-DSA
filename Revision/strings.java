import java.util.*;

public class strings {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // String name = "A man, a plan, a canal: Panama";
        // String str = "Sanmit";
        // String str2 = "a+((b-c)+d)";
        // char ch = 'A';
        // String input = "abc12xyz34pqr56";
        // String ana1 = "LISTEN";
        // String ana2 = "SILENT";
        String str = "apple";

        // isAnagram(ana1, ana2);
        // isPalindrom(name);
        // countVowels(name);
        // asciiValue(ch);
        // removeVowels(name);
        // removeSpecialCharacter(name);
        // reverse(str);
        // removeBrackets(str2);
        // SumOfNumbersInString(input);

        // String str3 = "take u forward is awesome";
        // capitalize(str3);
        char ans = maxOccurChar(str);
        System.out.println(ans);
    }

    public static void isPalindrom(String name) {
        name = name.trim().toLowerCase();
        name = name.replaceAll("[^a-zA-Z]", "");

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) != name.charAt(name.length() - i - 1)) {
                System.out.println("Not Palindrom");
                return;
            }
        }
        System.out.println("Yes Palindrom");
    }

    public static void countVowels(String name) {
        int vowels = 0;
        int consonents = 0;
        int whiteSpaces = 0;
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            }
            if (ch == ' ') {
                whiteSpaces++;
            } else {
                consonents++;
            }
        }
        System.out.println("Count of vowels is: " + vowels);
        System.out.println("Count of consonents is: " + consonents);
        System.out.println("Count of white spaces is: " + whiteSpaces);
    }

    public static void asciiValue(char ch) {
        int ascii = ch;
        System.out.println(ascii);
    }

    public static void removeVowels(String name) {
        StringBuilder sb = new StringBuilder();
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void removeSpecialCharacter(String name) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (Character.isLetter(ch)) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void reverse(String str) {
        // StringBuilder sb = new StringBuilder();
        // for (int i = str.length() - 1; i >= 0; i--) {
        // sb.append(str.charAt(i));
        // }
        // System.out.println(sb);

        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }
        System.out.println(reverse);
    }

    public static void removeBrackets(String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (ch == '(' || ch == ')') {
                continue;
            }
            sb.append(ch);
        }
        System.out.println(sb);
    }

    public static void SumOfNumbersInString(String str) {
        int sum = 0;
        String temp = "";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                temp += ch;
            } else {
                if (!temp.isEmpty()) {
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }

        // Adding the last collected number if any
        if (!temp.isEmpty()) {
            sum += Integer.parseInt(temp);
        }

        System.out.println(sum);
    }

    public static void capitalize(String str) {
        // capitalize the first and last letter of the word in string
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() == 1) {
                sb.append(word.toUpperCase());
            } else if (word.length() > 1) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1, word.length() - 1))
                        .append(Character.toUpperCase(word.charAt(word.length() - 1)));
            }

            if (i < words.length - 1) {
                sb.append(" "); // add space between them
            }
        }
        System.out.println(sb);
    }

    public static void isAnagram(String ana1, String ana2) {
        char[] charArray1 = ana1.toCharArray();
        char[] charArray2 = ana2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static char maxOccurChar(String str) {
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)]++;
        }
        int max = Integer.MIN_VALUE;
        char ch = ' ';
        for(int i = 0; i<str.length(); i++)
        {
            if(max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                ch = str.charAt(i);
            }
        }
        return ch;
    }
}
