public class c5RemoveSpace {
    public static void removeSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String str = "How are you doing";
        removeSpaces(str);
    }

}
