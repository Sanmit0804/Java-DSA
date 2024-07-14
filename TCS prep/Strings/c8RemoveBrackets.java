// Remove brackets from an algebraic expression

public class c8RemoveBrackets {
    public static void removeBrackets(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')' || ch == '(') {
                continue;
            } else {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        String input1 = "a+((b-c)+d)";
        removeBrackets(input1);
    }
}
