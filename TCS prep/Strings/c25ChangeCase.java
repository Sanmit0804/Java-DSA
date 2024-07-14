public class c25ChangeCase {
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

    public static void main(String[] args) {
        String str = "I am Sanmit Suthar";
        changeCase(str);
    }

}
