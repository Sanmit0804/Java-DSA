// Problem Statement: Given a string, write a program to Capitalize the first and last character of each word of that string.

public class c10Capitalize {
    public static void capitalize(String str) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (capitalizeNext) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }

            // Capitalize the last character of the word
            if (ch == ' ') {
                capitalizeNext = true;
            } else if (i + 1 == str.length() || str.charAt(i + 1) == ' ') {
                sb.setCharAt(sb.length() - 1, Character.toUpperCase(ch));
                capitalizeNext = false;
            } else {
                capitalizeNext = false;
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "take u forward is awesome";
        capitalize(str);
    }
}


// Doba jevii reet ch look at the  revision code