public class Revision2 {
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

    public static void ascii(char ch)
    {
        int n = ch;
        System.out.println(n);
    }
    public static void main(String[] args) {
        // String str = "A man, a plan, a canal: Panama";
        // System.out.println(isPalindrom(str));

        // String str = "A man, a plan, a canal: Panama";
        // countVowels(str);

        // char ch = 'A';
        // ascii(ch);
    }
}
