// Change every letter with next lexicographic alphabet

public class c20ChangeEveryLetter {
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

    public static void main(String[] args) {
        String str = "abcdxyz";
        NextLexicographicLetter(str);
    }
}