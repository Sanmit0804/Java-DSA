// Given a string, write a program to count the number of vowels, consonants, and spaces in that string.

public class c2CountVowels {
    public static void checkCounts(String str) {
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

    public static void main(String[] args) {
        String str = "India won the cricket match";
        checkCounts(str);
    }
}
