public class strings {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String name = "A man, a plan, a canal: Panama";
        char ch = 'A';
        // isPalindrom(name);
        // countVowels(name);
        // asciiValue(ch);
        // removeVowels(name);
        removeSpecialCharacter(name);
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

            if(Character.isLetter(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
